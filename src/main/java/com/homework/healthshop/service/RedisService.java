package com.homework.healthshop.service;

/**
 * @author tianyi
 * @date 2018-12-04 01:22
 */
public interface RedisService {

    public String setcookie(int id,int pattern) throws Exception;

    public boolean checkLogin(String token,int id,int pattern);
}
