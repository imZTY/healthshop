package com.homework.healthshop.DTO;

import com.homework.healthshop.entity.GoodBrief;
import com.homework.healthshop.entity.Orders;
import lombok.Data;

/**
 * @author tianyi
 * @date 2018-12-04 10:19
 */
@Data
public class OrderDTO {

    public OrderDTO(GoodBrief goodBrief, Orders orders){
        this.name = goodBrief.getName();
        this.price = goodBrief.getPrice();
        this.smallPic = goodBrief.getSmallPic();
        this.id = orders.getId();
        this.userId = orders.getUserId();
        this.gbriefId = orders.getGbriefId();
        this.buy = orders.getBuy();
        this.addressId = orders.getAddressId();
        this.isPaid = orders.isPaid();
        this.isSend = orders.isSend();
        this.dCompany = orders.getDCompany();
        this.dId = orders.getDId();
    }

    private String name;

    private double price;

    private String smallPic;

    private int id;

    private int userId;

    private int gbriefId;

    private int buy;

    private int addressId;

    private boolean isSend = false;

    private boolean isPaid = false;

    private String dCompany;

    private String dId;
}
