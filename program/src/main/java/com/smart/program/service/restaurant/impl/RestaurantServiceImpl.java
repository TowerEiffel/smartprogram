package com.smart.program.service.restaurant.impl;

import com.smart.program.domain.restaurant.RestaurantEntity;
import com.smart.program.repository.restaurant.RestaurantRepository;
import com.smart.program.service.restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    /**
     * 获取商店基本信息
     *
     * @return
     * @throws Exception
     */
    public RestaurantEntity queryRestaurant() throws Exception {
        return restaurantRepository.queryRestaurantEntity();
    }
}
