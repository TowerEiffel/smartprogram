package com.smart.program.controller;

import com.smart.program.common.ErrorConstant;
import com.smart.program.request.UserRequest;
import com.smart.program.response.ResponseVO;
import com.smart.program.response.order.OrderResponseList;
import com.smart.program.service.order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 获取订单信息
     *
     * @param request
     * @return
     */
    @RequestMapping(path = "/queryUserOrder", method = RequestMethod.POST)
    public ResponseVO<OrderResponseList> queryUserOrder(@RequestBody @Valid UserRequest request) {
        ResponseVO<OrderResponseList> responseVO = new ResponseVO<>();
        try {
            OrderResponseList orderResponseList = orderService.queryUserOrder(request);
            responseVO.setResult(ErrorConstant.SUCCESS_CODE, ErrorConstant.SUCCESS_MSG, orderResponseList);
        } catch (Exception e) {
            log.error("OrderController queryUserOrder -> {} Exception \n", request.toString(), e);
            responseVO.setResult(ErrorConstant.ERROR_CODE, ErrorConstant.ERROR_MSG);
        }
        return responseVO;
    }
}
