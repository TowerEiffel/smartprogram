package com.smart.program.controller;

import com.smart.program.common.ErrorConstant;
import com.smart.program.response.ResponseVO;
import com.smart.program.response.recharge.RechargePackageResponse;
import com.smart.program.service.recharge.RechargeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recharge")
@Slf4j
public class RechargeController {

    @Autowired
    private RechargeService rechargeService;

    /**
     * 获取充值套餐
     *
     * @return
     */
    @RequestMapping(path = "/queryRechargePackage", method = RequestMethod.POST)
    public ResponseVO<List<RechargePackageResponse>> queryRechargePackage() {
        ResponseVO<List<RechargePackageResponse>> responseVO = new ResponseVO<>();
        try {
            List<RechargePackageResponse> rechargePackageResponses = rechargeService.queryRechargePackage();
            responseVO.setResult(ErrorConstant.SUCCESS_CODE, ErrorConstant.SUCCESS_MSG, rechargePackageResponses);
        } catch (Exception e) {
            log.error("RechargeController queryRechargePackage Exception", e);
            responseVO.setResult(ErrorConstant.ERROR_CODE, ErrorConstant.ERROR_MSG);
        }
        return responseVO;
    }
}
