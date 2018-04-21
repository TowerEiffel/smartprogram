package com.smart.program.service.order;

import com.smart.program.domain.order.OrderItemEntity;

import java.util.List;

public interface OrderItemService {

    /**
     * 订单详情
     *
     * @param orderId
     * @return
     * @throws Exception
     */
    List<OrderItemEntity> queryOrderItem(Long orderId) throws Exception;
}
