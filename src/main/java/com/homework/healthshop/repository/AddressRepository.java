package com.homework.healthshop.repository;

import com.homework.healthshop.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tianyi
 * @date 2018-11-21 13:36
 */
public interface AddressRepository extends JpaRepository<Address,Integer> {
    public List<Address> findAllByUserId(int userId);
}
