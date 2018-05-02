package com.smart.program.response.dish;

import com.smart.program.domain.goods.GoodsPropertyEntity;
import lombok.Data;

import java.util.List;

@Data
public class DishTypeResponse {
    private List<GoodsPropertyEntity> types;
}
