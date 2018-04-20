package com.smart.program.repository;

import com.smart.program.domain.GoodsPropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsPropertyDao extends JpaRepository<GoodsPropertyEntity, Long> {

}
