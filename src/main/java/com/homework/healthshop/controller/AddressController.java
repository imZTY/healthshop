package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.annotation.IsLogin;
import com.homework.healthshop.entity.Address;
import com.homework.healthshop.entity.User;
import com.homework.healthshop.repository.AddressRepository;
import com.homework.healthshop.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-11-21 13:46
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */

    /**
     * @apiDefine Address 用户地址
     */

    /**
     * @api {post} /address/add 新增收货地址
     * @apiGroup Address
     * @apiParam {int} userId 用户id
     * @apiParam {String} postcode 邮政编码
     * @apiParam {String} province 省份
     * @apiParam {String} city 城市
     * @apiParam {String} detail 详细地址
     * @apiParam {String} recipient 收件人
     * @apiParam {String} phonenumber 联系电话
     * @apiSuccessExample Success-Request:
     * {
     *     phonenumber:18320444510
    userId:1
    postcode:510006
    province:广东省
    city:广州市
    detail:广州中医药大学大学城校区学生宿舍K722
    recipient:我在跑步不好意思
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 15,
    "userId": 1,
    "postcode": "510006",
    "province": "广东省",
    "city": "广州市",
    "detail": "广州中医药大学大学城校区学生宿舍K722",
    "recipient": "我在跑步不好意思",
    "phonenumber": "18320444510"
    }
     * }
     */
    @IsLogin
    @PostMapping("/add")
    public CommonDTO add(Address address){
        try {
            return CommonDTOUtil.success(addressRepository.save(address));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /address/delete 删除地址
     * @apiGroup Address
     * @apiParam {int} id 地址id
     * @apiSuccessExample Success-Request:
     * {
     *     id:14
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": "ok"
     * }
     */
    @PostMapping("/delete")
    public CommonDTO delete(Address address){
        try {
            addressRepository.deleteById(address.getId());
            return CommonDTOUtil.success("ok");
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /address/update 更改地址信息
     * @apiGroup Address
     * @apiParam {int} id 地址id
     * @apiParam {int} userId 用户id
     * @apiParam {String} postcode 邮政编码
     * @apiParam {String} province 省份
     * @apiParam {String} city 城市
     * @apiParam {String} detail 详细地址
     * @apiParam {String} recipient 收件人
     * @apiParam {String} phonenumber 联系电话
     * @apiSuccessExample Success-Request:
     * {
     *     phonenumber:18320444510
    userId:1
    postcode:510006
    province:广东省
    city:广州市
    detail:广州中医药大学大学城校区学生宿舍K722
    recipient:我已经跑完步了
    id:15
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 15,
    "userId": 1,
    "postcode": "510006",
    "province": "广东省",
    "city": "广州市",
    "detail": "广州中医药大学大学城校区学生宿舍K722",
    "recipient": "我已经跑完步了",
    "phonenumber": "18320444510"
    }
     * }
     */
    @IsLogin
    @PostMapping("/update")
    public CommonDTO update(Address address){
        try {
            Address Naddress = addressRepository.findById(address.getId()).get();
            if (!address.getPostcode().equals("")){
                Naddress.setPostcode(address.getPostcode());
            }
            if (!address.getProvince().equals("")){
                Naddress.setProvince(address.getProvince());
            }
            if (!address.getCity().equals("")){
                Naddress.setCity(address.getCity());
            }
            if (!address.getDetail().equals("")){
                Naddress.setCity(address.getCity());
            }
            if (!address.getRecipient().equals("")){
                Naddress.setRecipient(address.getRecipient());
            }
            if (!address.getPhonenumber().equals("")){
                Naddress.setPhonenumber(address.getPhonenumber());
            }
            return CommonDTOUtil.success(addressRepository.saveAndFlush(Naddress));
//            return CommonDTOUtil.success(addressRepository.saveAndFlush(address));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /address/byUser 获取特定用户的地址列表
     * @apiGroup Address
     * @apiParam {int} id 用户的id
     * @apiSuccessExample Success-Request:
    {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
    {}
     */
    @IsLogin
    @PostMapping("/byUser")
    public CommonDTO listByUser(User user){
        return CommonDTOUtil.success(addressRepository.findAllByUserId(user.getId()));
    }
}
