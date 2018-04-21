package com.smart.program.repository.order;

import com.smart.program.domain.order.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemDao extends JpaRepository<OrderItemEntity, Long> {

    /**
     * 获取订单详情
     *
     * @return
     * @throws Exception
     */
    @Query(value = "select orderItem from OrderItemEntity orderItem where orderItem.orderId = :orderId and orderItem.dataStatus = '1'")
    List<OrderItemEntity> queryOrderItem(@Param("orderId") Long orderId) throws Exception;
}
