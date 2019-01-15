package com.homework.healthshop.repository;

import com.homework.healthshop.DTO.OrderDTO;
import com.homework.healthshop.entity.GoodBrief;
import com.homework.healthshop.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author tianyi
 * @date 2018-11-21 13:38
 */
public interface OrdersRepository extends JpaRepository<Orders,Integer> {
    @Query("SELECT new com.homework.healthshop.DTO.OrderDTO(b,o) FROM Orders o,GoodBrief b WHERE o.userId=?1 AND o.gbriefId = b.id")
    public List<OrderDTO> NfindAllByUserId(int userId);


}
