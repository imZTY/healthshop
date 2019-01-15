package com.homework.healthshop.service.Impl;

import com.homework.healthshop.constant.RedisContant;
import com.homework.healthshop.service.RedisService;
import com.homework.healthshop.utils.AESUtil;
import com.homework.healthshop.utils.DesUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author tianyi
 * @date 2018-12-04 01:26
 */
@Service
@Slf4j
public class RedisServiceImpl implements RedisService{

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public String setcookie(int id,int pattern) throws Exception {
        if (pattern==1){
            String rt = AESUtil.encrypt(""+id);
//            String rt = new String((id+10086)+"");
            String cacheName = new String("user_"+id);
            redisTemplate.opsForValue().set(cacheName, rt, RedisContant.EXPIRE, TimeUnit.SECONDS);
            return rt;
        }else {
            String rt = DesUtil.encrypt(""+id);
            String cacheName = new String("admin_"+rt);
            redisTemplate.opsForValue().set(cacheName, rt, RedisContant.EXPIRE, TimeUnit.SECONDS);
            return rt;
        }
    }

    @Override
    public boolean checkLogin(String token,int id,int pattern) {
        if (pattern==1){
            String cacheName = new String("user_"+id);
            String cacheValue = redisTemplate.opsForValue().get(cacheName);
            return cacheValue.equals(token)?true:false;
        }else {
            String cacheName = new String("admin_"+id);
            String cacheValue = redisTemplate.opsForValue().get(cacheName);
            return cacheValue.equals(token)?true:false;
        }
    }
}
