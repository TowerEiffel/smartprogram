package com.smart.program.request.order;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class PlaceOrderRequest {
    @NotNull(message = "用户id不能为空")
    private Long userId;
    @NotNull(message = "选择商品不能为空")
    private List<OrderItemDTO> orderItems;
    private String memo;//备注
}
