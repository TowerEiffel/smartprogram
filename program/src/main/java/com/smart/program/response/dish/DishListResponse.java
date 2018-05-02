package com.smart.program.response.dish;

import com.smart.program.domain.goods.GoodsCateEntity;
import com.smart.program.domain.goods.GoodsEntity;
import lombok.Data;

import java.util.List;

@Data
public class DishListResponse {
    private List<GoodsCateEntity> cate;
    private List<GoodsEntity> msg;
}
