package com.smart.program.service.order.impl;

import com.smart.program.domain.order.OrderInfoEntity;
import com.smart.program.domain.order.OrderItemEntity;
import com.smart.program.domain.restaurant.RestaurantEntity;
import com.smart.program.repository.order.OrderInfoDao;
import com.smart.program.request.UserRequest;
import com.smart.program.response.order.OrderResponse;
import com.smart.program.response.order.OrderResponseList;
import com.smart.program.service.order.OrderItemService;
import com.smart.program.service.order.OrderService;
import com.smart.program.service.restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderItemService orderItemService;

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private OrderInfoDao orderInfoDao;

    /**
     * 获取用户订单信息
     *
     * @param request
     * @return
     * @throws Exception
     */
    public OrderResponseList queryUserOrder(UserRequest request) throws Exception {
        OrderResponseList orderResponseList = new OrderResponseList();

        RestaurantEntity restaurantEntity = restaurantService.queryRestaurant();

        //未支付订单
        List<OrderInfoEntity> unPayOrderList = orderInfoDao.findUnPayOrderByUserId(request);
        List<OrderResponse> unPayOrderResponseList = getOrderResponseList(restaurantEntity, unPayOrderList);
        orderResponseList.setUnPayResponses(unPayOrderResponseList);

        //已支付订单
        List<OrderInfoEntity> payOrderList = orderInfoDao.findPayOrderByUserId(request);
        List<OrderResponse> payOrderResponseList = getOrderResponseList(restaurantEntity, payOrderList);
        orderResponseList.setPayResponses(payOrderResponseList);

        //已取消订单
        List<OrderInfoEntity> cancelOrderList = orderInfoDao.findCancelOrderByUserId(request);
        List<OrderResponse> cancelOrderResponseList = getOrderResponseList(restaurantEntity, cancelOrderList);
        orderResponseList.setCancelResponses(cancelOrderResponseList);
        return orderResponseList;
    }

    /**
     * 获取订单信息
     *
     * @param restaurantEntity
     * @param unPayOrderList
     * @return
     * @throws Exception
     */
    private List<OrderResponse> getOrderResponseList(RestaurantEntity restaurantEntity, List<OrderInfoEntity> unPayOrderList) throws Exception {
        List<OrderResponse> orderResponses = new ArrayList<>();
        for (OrderInfoEntity orderInfoEntity : unPayOrderList) {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setRestaurantId(restaurantEntity.getRestaurantId());
            orderResponse.setRestaurantName(restaurantEntity.getRestaurantName());
            orderResponse.setRestaurantCode(restaurantEntity.getRestaurantCode());
            orderResponse.setRestaurantUrl(restaurantEntity.getRestaurantImg());
            orderResponse.setOrderId(orderInfoEntity.getOrderId());
            orderResponse.setOrderStatus(orderInfoEntity.getPayStatus());
            BigDecimal money = BigDecimal.ZERO;
            BigDecimal delMoney = BigDecimal.ZERO;
            BigDecimal actMoney = BigDecimal.ZERO;
            List<OrderItemEntity> orderItemEntities = orderItemService.queryOrderItem(orderInfoEntity.getOrderId());
            for (OrderItemEntity orderItemEntity : orderItemEntities) {
                money.add(orderItemEntity.getGoodsPrice());
                actMoney.add(orderItemEntity.getRealPrice());
            }
            delMoney = money.subtract(actMoney);
            orderResponse.setMoney(money);
            orderResponse.setDelMoney(delMoney);
            orderResponse.setActMoney(actMoney);
            orderResponses.add(orderResponse);
        }
        return orderResponses;
    }
}
