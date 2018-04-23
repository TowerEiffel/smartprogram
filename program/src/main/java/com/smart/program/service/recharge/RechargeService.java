package com.smart.program.service.recharge;

import com.smart.program.response.recharge.RechargePackageResponse;

import java.util.List;

public interface RechargeService {

    /**
     * 获取充值套餐
     *
     * @return
     * @throws Exception
     */
    List<RechargePackageResponse> queryRechargePackage() throws Exception;
}
