package com.homework.healthshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author tianyi
 * @date 2018-11-21 02:35
 */
@Entity
@Data
public class Sort implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;
}
