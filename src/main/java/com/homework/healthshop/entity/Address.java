package com.homework.healthshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author tianyi
 * @date 2018-11-21 02:35
 */
@Entity
@Data
public class Address implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private int userId;

    private String postcode;

    private String province;

    private String city;

    private String detail;

    private String recipient;

    private String phonenumber;
}
