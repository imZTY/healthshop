package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.entity.User;
import com.homework.healthshop.repository.UserRepository;
import com.homework.healthshop.service.RedisService;
import com.homework.healthshop.utils.DesUtil;
import com.homework.healthshop.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-11-21 13:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RedisService redisService;
    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */

    /**
     * @apiDefine User 用户
     */

    /**
     * @api {post} /user/add 添加用户
     * @apiGroup User
     * @apiParam {String} nickname 昵称
     * @apiParam {String} password 密码
     * @apiParam {String} phonenumber 手机号
     * @apiSuccessExample Success-Request:
     * {
     *   nickname:我是昵称
    password:123456
    phonenumber:18320444511
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 1,
    "nickname": "我是昵称",
    "password": "123456",
    "phonenumber": "18320444511"
    }
     * }
     */
    @PostMapping("/add")
    public CommonDTO add(User user){
        try {
            return CommonDTOUtil.success(userRepository.save(user));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /user/delete 删除用户
     * @apiGroup User
     * @apiParam {int} id 用户id
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
    "resultCode": 200,
    "resultMsg": "成功",
    "data": "ok"
    }
     */
    @PostMapping("/delete")
    public CommonDTO delete(User user){
        try {
            userRepository.deleteById(user.getId());
            return CommonDTOUtil.success("ok");
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /user/update 更新用户信息
     * @apiGroup User
     * @apiParam {int} id 用户id
     * @apiParam {String} nickname 昵称
     * @apiParam {String} password 密码
     * @apiParam {String} phonenumber 手机号
     * @apiSuccessExample Success-Request:
     * {
     *     nickname:我是昵称1
    password:123
    phonenumber:18320444510
    id:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 1,
    "nickname": "我是昵称1",
    "password": "123",
    "phonenumber": "18320444510"
    }
     * }
     */
    @PostMapping("/update")
    public CommonDTO update(User user){
        try {
            return CommonDTOUtil.success(userRepository.saveAndFlush(user));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /user/login 用户登录
     * @apiGroup User
     * @apiParam {String} phonenumber 手机号
     * @apiParam {String} password 密码
     * @apiSuccessExample Success-Request:
     * {
     *     password:123
    phonenumber:18320444510
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 1,
    "nickname": "我是昵称1",
    "password": "123",
    "phonenumber": "18320444510"
    }
     * }
     */
    @PostMapping("/login")
    public CommonDTO login(@RequestParam("phonenumber")String phonenumber,
                           @RequestParam("password")String password){
        try {
            User user = userRepository.findFirstByPhonenumber(phonenumber);
            if (user == null){
                return CommonDTOUtil.error(444,"not found");
            }
            if (password.equals(user.getPassword())){
                CommonDTO rt = CommonDTOUtil.success(user);
                rt.setResultMsg(redisService.setcookie(user.getId(),1));
                return rt;
            }else {
                return CommonDTOUtil.error(444,"wrong password");
            }
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }
}
