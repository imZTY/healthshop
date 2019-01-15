package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.annotation.IsLogin;
import com.homework.healthshop.entity.Orders;
import com.homework.healthshop.repository.OrdersRepository;
import com.homework.healthshop.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author tianyi
 * @date 2018-11-21 13:45
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersRepository ordersRepository;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */

    /**
     * @apiDefine Orders 用户订单
     */

    /**
     * @api {post} /orders/add 提交订单
     * @apiGroup Orders
     * @apiParam {int} userId 用户ID
     * @apiParam {int} gbriefId 商品id
     * @apiParam {int} buy 购买数量
     * @apiParam {int} addressId 地址ID
     * @apiSuccessExample Success-Request:
     * {
     *     userId:1
    gbriefId:1
    buy:3
    addressId:15
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 16,
    "userId": 1,
    "gbriefId": 1,
    "buy": 3,
    "addressId": 15,
    "paid": false,
    "send": false,
    "dcompany": null,
    "did": null
    }
     * }
     */
    @IsLogin
    @PostMapping("/add")
    public CommonDTO add(Orders orders){
        try {
            return CommonDTOUtil.success(ordersRepository.save(orders));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/delete")
    public CommonDTO delete(Orders orders){
        try {
            ordersRepository.deleteById(orders.getId());
            return CommonDTOUtil.success("ok");
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /orders/update 修改订单信息
     * @apiGroup Orders
     * @apiParam {int} id 订单ID
     * @apiParam {boolean} send 是否已发货
     * @apiParam {boolean} paid 是否已支付
     * @apiParam {String} dCompany 快递公司名
     * @apiParam {String} dId 快递单号
     * @apiSuccessExample Success-Request:
     * {
     *     id:16
    send:true
    paid:true
    dCompany:顺丰速运
    dId:1234567
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "id": 16,
    "userId": 1,
    "gbriefId": 1,
    "buy": 3,
    "addressId": 15,
    "paid": true,
    "send": true,
    "dcompany": "顺丰速运",
    "did": "1234567"
    }
    }
     * }
     */
    @IsLogin
    @PostMapping("/update")
    public CommonDTO update(Orders orders){
        try {
            System.out.println(orders.toString());
            Orders Norders = ordersRepository.findById(orders.getId()).get();
            if (orders.isPaid()){
                Norders.setPaid(true);
            }
            if (orders.isSend()){
                Norders.setSend(true);
            }
            if (orders.getDCompany()!=null&&!orders.getDCompany().equals("")){
                Norders.setDCompany(orders.getDCompany());
            }
            if (orders.getDId()!=null&&!orders.getDId().equals("")){
                Norders.setDId(orders.getDId());
            }
            //TODO 逻辑待完善
            return CommonDTOUtil.success(ordersRepository.saveAndFlush(Norders));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {get} /orders/user 获取用户的历史订单
     * @apiGroup Orders
     * @apiParam {int} userId 用户ID
     * @apiSuccessExample Success-Request:
     * {
     *     userId:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "id": 16,
    "userId": 1,
    "gbriefId": 1,
    "buy": 3,
    "addressId": 15,
    "paid": true,
    "send": true,
    "dcompany": "顺丰速运",
    "did": "1234567"
    }
    ]
     * }
     */
    @IsLogin
    @GetMapping("/user")
    public CommonDTO findOne(@RequestParam("userId")int userId){
        try {
            return CommonDTOUtil.success(ordersRepository.NfindAllByUserId(userId));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }
}
