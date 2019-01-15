package com.homework.healthshop.repository;

import com.homework.healthshop.DTO.DetailDTO;
import com.homework.healthshop.entity.GoodBrief;
import com.homework.healthshop.entity.GoodDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author tianyi
 * @date 2018-11-21 13:36
 */
public interface GoodDetailRepository extends JpaRepository<GoodDetail,Integer> {

    public GoodDetail findFirstByGbriefId(int gbriefId);

    @Query("SELECT new com.homework.healthshop.DTO.DetailDTO(b,d) FROM GoodBrief b,GoodDetail d WHERE d.gbriefId = ?1 AND b.id = d.gbriefId")
    public DetailDTO findOneDetailById(int gbriefId);
}
