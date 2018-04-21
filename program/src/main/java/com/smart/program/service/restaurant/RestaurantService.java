package com.smart.program.service.restaurant;

import com.smart.program.domain.restaurant.RestaurantEntity;

public interface RestaurantService {

    /**
     * 获取商店基本信息
     *
     * @return
     * @throws Exception
     */
    RestaurantEntity queryRestaurant() throws Exception;
}
