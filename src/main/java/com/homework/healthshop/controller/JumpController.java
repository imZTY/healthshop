package com.homework.healthshop.controller;

import com.homework.healthshop.DTO.CommonDTO;
import com.homework.healthshop.entity.User;
import com.homework.healthshop.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.sf.json.JSONObject;

/**
 * @author tianyi
 * @date 2018-10-30 13:29
 */
@RestController
@RequestMapping("/temp")
public class JumpController {

    @GetMapping("/user")
    public String test(User user){
        System.out.println(user.toString());
        return user.toString();
    }
}
