package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.annotation.IsLogin;
import com.homework.healthshop.entity.GoodBrief;
import com.homework.healthshop.repository.GoodBriefRepository;
import com.homework.healthshop.utils.CommonDTOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.net.URLDecoder;

/**
 * @author tianyi
 * @date 2018-11-21 13:45
 */
@RestController
@RequestMapping("/gbrief")
@Slf4j
public class GoodBriefController {

    @Autowired
    private GoodBriefRepository goodBriefRepository;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */

    /**
     * @apiDefine GoodBrief 商品简要
     */


    @PostMapping("/add")
    public CommonDTO add(GoodBrief goodBrief){
        try {
            return CommonDTOUtil.success(goodBriefRepository.save(goodBrief));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/delete")
    public CommonDTO delete(GoodBrief goodBrief){
        try {
            goodBriefRepository.deleteById(goodBrief.getId());
            return CommonDTOUtil.success("ok");
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/update")
    public CommonDTO update(GoodBrief goodBrief){
        try {
            return CommonDTOUtil.success(goodBriefRepository.saveAndFlush(goodBrief));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {get} /gbrief/getList 获取商品简要列表
     * @apiGroup GoodBrief
     * @apiParam {int} sortId 分类的id
     * @apiSuccessExample Success-Request:
     * {
     *      sortId:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "id": 1,
    "name": "人参",
    "buy": 2,
    "volume": 20,
    "smallPic": null,
    "price": 10,
    "sortId": 1,
    "startTime": 1542899893,
    "endTime": 1542986293
    }
    ]
     * }
     */
    @IsLogin
    @GetMapping("/getList")
    public CommonDTO getList(GoodBrief goodBrief){
        try{
            if (goodBrief.getSortId() == 0){
                return CommonDTOUtil.success(goodBriefRepository.findAll());
            }else {
                return CommonDTOUtil.success(goodBriefRepository.findAllBySortId(goodBrief.getSortId()));
            }
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {get} /gbrief/search 按名称搜索
     * @apiGroup GoodBrief
     * @apiParam {String} name 查询的内容
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @IsLogin
    @GetMapping("/search")
    public CommonDTO nameLike(@RequestParam(name = "key",defaultValue = "")String key, GoodBrief goodBrief){
        try{
            System.out.println(key);
            key = URLDecoder.decode(key, "UTF-8");
            log.warn("key={}",key);
            if (key.equals("")){
                return CommonDTOUtil.success(goodBriefRepository.findAll());
            }else {
                return CommonDTOUtil.success(goodBriefRepository.findByNameLike("%"+key+"%"));
            }
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    //
    @IsLogin
    @GetMapping("/bySort")
    public CommonDTO gbBysort(@RequestParam(name = "sortId",defaultValue = "0")int sortId){
        try{
            if (sortId == 0){
                return CommonDTOUtil.success(goodBriefRepository.findAll());
            }else {
                return CommonDTOUtil.success(goodBriefRepository.findAllBySortId(sortId));
            }
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }
}
