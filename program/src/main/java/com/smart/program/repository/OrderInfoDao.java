package com.smart.program.repository;

import com.smart.program.domain.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoDao extends JpaRepository<OrderInfoEntity, Long> {

}
