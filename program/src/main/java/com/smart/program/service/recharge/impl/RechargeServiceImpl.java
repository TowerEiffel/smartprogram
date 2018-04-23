package com.smart.program.service.recharge.impl;

import com.smart.program.domain.recharge.RechargePackageEntity;
import com.smart.program.repository.recharge.RechargePackageRepository;
import com.smart.program.response.recharge.RechargePackageResponse;
import com.smart.program.service.recharge.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RechargeServiceImpl implements RechargeService {

    @Autowired
    private RechargePackageRepository rechargePackageRepository;

    /**
     * 获取充值套餐
     *
     * @return
     * @throws Exception
     */
    public List<RechargePackageResponse> queryRechargePackage() throws Exception {
        List<RechargePackageResponse> rechargePackageResponses = new ArrayList<>();
        List<RechargePackageEntity> rechargePackageEntities = rechargePackageRepository.queryRechargePackageList();
        for (RechargePackageEntity rechargePackageEntity : rechargePackageEntities) {
            RechargePackageResponse rechargePackageResponse = new RechargePackageResponse();
            rechargePackageResponse.setPackageId(rechargePackageEntity.getPackageId());
            rechargePackageResponse.setRechargeMoney(rechargePackageEntity.getRechargeMoney());
            rechargePackageResponse.setPayMoney(rechargePackageEntity.getPayMoney());
            rechargePackageResponses.add(rechargePackageResponse);
        }
        return rechargePackageResponses;
    }
}
