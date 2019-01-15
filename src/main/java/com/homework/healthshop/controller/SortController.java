package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.entity.Sort;
import com.homework.healthshop.repository.SortRepository;
import com.homework.healthshop.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-11-21 13:46
 */
@RestController
@RequestMapping("/sort")
public class SortController {

    @Autowired
    private SortRepository sortRepository;

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 错误信息
     *  @apiSuccess {Object} data 主体信息
     */

    /**
     * @apiDefine Sort 商品种类
     */

    @PostMapping("/add")
    public CommonDTO add(Sort sort){
        try {
            return CommonDTOUtil.success(sortRepository.save(sort));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/delete")
    public CommonDTO delete(Sort sort){
        try {
            sortRepository.deleteById(sort.getId());
            return CommonDTOUtil.success("ok");
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    @PostMapping("/update")
    public CommonDTO update(Sort sort){
        try {
            return CommonDTOUtil.success(sortRepository.saveAndFlush(sort));
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {get} /sort/getList 获取所有分类
     * @apiGroup Sort
     * @apiSuccessExample Success-Request:
     * {
     *
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "id": 1,
    "name": "药材",
    "description": "这个分类包括各种药材"
    },
    {
    "id": 2,
    "name": "水果",
    "description": "这个分类包括各种健康水果"
    },
    {
    "id": 3,
    "name": "健康制品",
    "description": "包括各健康养生的食品轻工业制品"
    }
    ]
     * }
     */
    @GetMapping("/getList")
    public CommonDTO getList(){
        try{
            return CommonDTOUtil.success(sortRepository.findAll());
        }catch (Exception e){
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }
}
