package com.homework.healthshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author tianyi
 * @date 2018-11-21 02:36
 */
@Entity
@Data
public class Orders implements Serializable {
    @Id
    @GeneratedValue
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
