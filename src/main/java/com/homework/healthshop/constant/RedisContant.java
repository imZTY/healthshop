package com.homework.healthshop.constant;

/**
 * @author tianyi
 * @date 2018-10-24 22:48
 */
public interface RedisContant {

    String PATIENTS_FORMAT = "%s_%s";

    String DOCTOR_FORMAT = "doctor_%s";

    String BOOK_FORMAT = "%s_%s";

    Integer EXPIRE = 7200; //2小时
}
