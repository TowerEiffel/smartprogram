package com.smart.program.controller;

import com.smart.program.common.ErrorConstant;
import com.smart.program.response.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/restaurant")
public class RestaurantController {

    /**
     * 获取酒店介绍信息
     * @return
     */
    @RequestMapping(path = "/queryRestaurantIntroduce")
    public ResponseVO queryRestaurantIntroduce() {
        ResponseVO responseVO = new ResponseVO();
        try {

        } catch (Exception e) {
            log.error("RestaurantController queryRestaurantIntroduce Exception \n", e);
            responseVO.setResult(ErrorConstant.ERROR_CODE, ErrorConstant.ERROR_MSG);
        }
        return responseVO;
    }
}
