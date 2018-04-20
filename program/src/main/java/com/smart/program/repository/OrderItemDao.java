package com.smart.program.repository;

import com.smart.program.domain.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemDao extends JpaRepository<OrderItemEntity, Long> {

}
