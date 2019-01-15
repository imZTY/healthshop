package com.homework.healthshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author tianyi
 * @date 2018-11-21 01:44
 */
@Entity
@Data
public class User implements Serializable{
    @Id
    @GeneratedValue
    private int id;

    private String nickname;

    private String password;

    @Pattern(regexp="\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
    private String phonenumber;
}
