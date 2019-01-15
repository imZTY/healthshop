package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.entity.Admin;
import com.homework.healthshop.repository.AdminRepository;
import com.homework.healthshop.utils.AESUtil;
import com.homework.healthshop.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-11-21 13:45
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */

    /**
     * @apiDefine Admin 管理员
     */

    @PostMapping("/add")
    public CommonDTO add(Admin admin){
        try {
            return CommonDTOUtil.success(adminRepository.save(admin));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/delete")
    public CommonDTO delete(Admin admin){
        try {
            adminRepository.deleteById(admin.getId());
            return CommonDTOUtil.success("ok");
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/update")
    public CommonDTO update(Admin admin){
        try {
            return CommonDTOUtil.success(adminRepository.saveAndFlush(admin));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /admin/login 管理员登录
     * @apiGroup Admin
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
    "nickname": "我是管理员",
    "password": "123",
    "phonenumber": "18320444515"
    }
     * }
     */
    @PostMapping("/login")
    public CommonDTO login(@RequestParam("phonenumber")String phonenumber,
                           @RequestParam("password")String password){
        try {
            Admin admin = adminRepository.findFirstByPhonenumber(phonenumber);
            if (admin == null){
                return CommonDTOUtil.error(444,"not found");
            }
            if (password.equals(admin.getPassword())){
                CommonDTO rt = CommonDTOUtil.success(admin);
                rt.setResultMsg(AESUtil.encrypt(""+admin.getId()));
                return rt;
            }else {
                return CommonDTOUtil.error(444,"wrong password");
            }
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }
}
