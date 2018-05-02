package com.smart.program.service.dish;

import com.smart.program.request.dish.DishTypeRequest;
import com.smart.program.response.dish.DishListResponse;
import com.smart.program.response.dish.DishTypeResponse;

public interface DishService {

    DishListResponse findDishList() throws Exception;

    DishTypeResponse goodsType(DishTypeRequest request) throws Exception;
}
