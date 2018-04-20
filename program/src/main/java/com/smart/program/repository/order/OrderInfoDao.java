package com.smart.program.repository.order;

import com.smart.program.domain.order.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoDao extends JpaRepository<OrderInfoEntity, Long> {

}
