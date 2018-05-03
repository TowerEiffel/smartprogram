package com.smart.program.response.dish;

import com.smart.program.domain.goods.GoodsDTO;
import lombok.Data;

import java.util.List;

@Data
public class DishListResponse {
    private List<GoodsDTO> dishList;
}
