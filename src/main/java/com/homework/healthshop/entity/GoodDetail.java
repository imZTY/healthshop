package com.homework.healthshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author tianyi
 * @date 2018-11-21 02:34
 */
@Entity
@Data
public class GoodDetail implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private int gbriefId;

    private String description;
}
