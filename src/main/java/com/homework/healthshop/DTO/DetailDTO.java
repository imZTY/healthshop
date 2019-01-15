package com.homework.healthshop.DTO;

import com.homework.healthshop.entity.GoodBrief;
import com.homework.healthshop.entity.GoodDetail;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author tianyi
 * @date 2018-12-04 00:53
 */
@Data
public class DetailDTO {

    public DetailDTO(GoodBrief goodBrief, GoodDetail goodDetail){
        this.id = goodBrief.getId();
        this.name = goodBrief.getName();
        this.buy = goodBrief.getBuy();
        this.volume = goodBrief.getVolume();
        this.smallPic = goodBrief.getSmallPic();
        this.price = goodBrief.getPrice();
        this.sortId = goodBrief.getSortId();
        this.startTime = goodBrief.getStartTime();
        this.endTime = goodBrief.getEndTime();
        this.description = goodDetail.getDescription();
    }

    private int id;

    private String name;

    private int buy;

    private int volume;

    private String smallPic;

    private double price;

    private int sortId;

    private Long startTime;

    private Long endTime;


    private String description;
}
