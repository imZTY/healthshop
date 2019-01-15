package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.entity.GoodDetail;
import com.homework.healthshop.repository.GoodDetailRepository;
import com.homework.healthshop.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author tianyi
 * @date 2018-11-21 13:45
 */
@RestController
@RequestMapping("/gdetail")
public class GoodDetailController {

    @Autowired
    private GoodDetailRepository goodDetailRepository;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */

    /**
     * @apiDefine GoodDetail 商品详细
     */

    @PostMapping("/add")
    public CommonDTO add(GoodDetail goodDetail){
        try {
            return CommonDTOUtil.success(goodDetailRepository.save(goodDetail));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/delete")
    public CommonDTO delete(GoodDetail goodDetail){
        try {
            goodDetailRepository.deleteById(goodDetail.getId());
            return CommonDTOUtil.success("ok");
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/update")
    public CommonDTO update(GoodDetail goodDetail){
        try {
            return CommonDTOUtil.success(goodDetailRepository.saveAndFlush(goodDetail));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {get} /gdetail/one 按id获取商品详情
     * @apiGroup GoodDetail
     * @apiParam {int} id 商品的id
     * @apiSuccessExample Success-Request:
    {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
    {}
     */
    @GetMapping("/one")
    public CommonDTO findOne(@RequestParam("id")int gbriefId){
        try {
            return CommonDTOUtil.success(goodDetailRepository.findOneDetailById(gbriefId));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }
}
