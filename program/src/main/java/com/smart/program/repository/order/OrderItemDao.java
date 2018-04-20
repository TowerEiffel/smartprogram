package com.smart.program.repository.order;

import com.smart.program.domain.order.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemDao extends JpaRepository<OrderItemEntity, Long> {

}
