package com.smart.program.service.order;

import com.smart.program.request.UserRequest;
import com.smart.program.response.order.OrderResponseList;

public interface OrderService {

    /**
     * 获取用户订单信息
     *
     * @param request
     * @return
     * @throws Exception
     */
    OrderResponseList queryUserOrder(UserRequest request) throws Exception;
}
