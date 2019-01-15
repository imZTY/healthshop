package com.homework.healthshop.aspect;

import com.homework.healthshop.repository.UserRepository;
import com.homework.healthshop.service.RedisService;
import com.homework.healthshop.utils.AESUtil;
import com.homework.healthshop.utils.DesUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tianyi
 * @date 2018-11-30 11:05
 */
@Aspect
@Component
@Slf4j
public class CheckLogin {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RedisService redisService;

    @Pointcut("@annotation(com.homework.healthshop.annotation.IsLogin)")
    public void check() {

    }

    @Before("check()")
    public void preHandle(JoinPoint joinPoint) throws Exception {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = java.net.URLDecoder.decode(request.getHeader("token"),"UTF-8");// 从 http 请求头中取出 token
        if (token!=null) {
            log.info("token={}", token);
            int userId = Integer.parseInt(AESUtil.decrypt(token));
//            int userId = Integer.parseInt(token)-10086;
            log.warn(""+userId);
            if (userRepository.findById(userId).get() == null){
                throw new RuntimeException("token 不合法，不存在该用户");
            }else if(!redisService.checkLogin(token,userId,1)){
                throw new RuntimeException("登录过期，请重新登录");
            }
        }else {
            throw new RuntimeException("无token，请登录");
        }
        return ;
    }
}
