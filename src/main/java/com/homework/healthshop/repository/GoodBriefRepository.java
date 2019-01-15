package com.homework.healthshop.repository;

import com.homework.healthshop.entity.GoodBrief;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tianyi
 * @date 2018-11-21 13:35
 */
public interface GoodBriefRepository extends JpaRepository<GoodBrief,Integer> {
    List<GoodBrief> findAllBySortId(int sortId);

    List<GoodBrief> findByNameLike(String name);
}
