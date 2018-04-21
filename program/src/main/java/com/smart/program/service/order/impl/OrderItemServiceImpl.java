package com.smart.program.service.order.impl;

import com.smart.program.domain.order.OrderItemEntity;
import com.smart.program.repository.order.OrderItemDao;
import com.smart.program.service.order.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemDao orderItemDao;

    /**
     * 订单详情
     *
     * @param orderId
     * @return
     * @throws Exception
     */
    public List<OrderItemEntity> queryOrderItem(Long orderId) throws Exception {
        return orderItemDao.queryOrderItem(orderId);
    }
}
