package com.homework.healthshop.aspect;

import com.homework.healthshop.repository.AdminRepository;
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
public class CheckAdmin {

    @Autowired
    private AdminRepository adminRepository;

    @Pointcut("@annotation(com.homework.healthshop.annotation.IsAdmin)")
    public void check() {

    }

    @Before("check()")
    public void preHandle(JoinPoint joinPoint) throws Exception {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");// 从 http 请求头中取出 token
        if (token!=null) {
            log.info("token={}", token);//TODO
        }else {
            throw new RuntimeException("无token，请登录");
        }
        return ;
    }
}
