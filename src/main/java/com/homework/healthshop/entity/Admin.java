package com.homework.healthshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author tianyi
 * @date 2018-11-21 02:33
 */
@Entity
@Data
public class Admin implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private String nickname;

    private String password;

    @Pattern(regexp="\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
    private String phonenumber;
}
