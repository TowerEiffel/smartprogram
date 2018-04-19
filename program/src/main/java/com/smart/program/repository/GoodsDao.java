package com.smart.program.repository;

import com.smart.program.domain.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDao extends JpaRepository<GoodsEntity, Long> {

}
