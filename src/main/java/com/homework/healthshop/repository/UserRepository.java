package com.homework.healthshop.repository;

import com.homework.healthshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tianyi
 * @date 2018-11-21 09:30
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    public User findFirstByPhonenumber(String phonenumber);
}
