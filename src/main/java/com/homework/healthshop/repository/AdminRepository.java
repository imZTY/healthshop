package com.homework.healthshop.repository;

import com.homework.healthshop.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tianyi
 * @date 2018-11-21 13:34
 */
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    public Admin findFirstByPhonenumber(String phonenumber);
}
