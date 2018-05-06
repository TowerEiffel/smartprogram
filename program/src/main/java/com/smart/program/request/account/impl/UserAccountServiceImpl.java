package com.smart.program.request.account.impl;

import com.smart.program.common.ErrorConstant;
import com.smart.program.domain.account.AccountEntity;
import com.smart.program.domain.account.AccountWaterEntity;
import com.smart.program.domain.recharge.RechargeOrderEntity;
import com.smart.program.exception.BusinessException;
import com.smart.program.idwork.IdWorker;
import com.smart.program.repository.account.AccountDao;
import com.smart.program.repository.recharge.RechargeOrderRepository;
import com.smart.program.request.account.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private RechargeOrderRepository rechargeOrderRepository;

    /**
     * 修改用户现金账户信息
     *
     * @param orderId    用户主键
     * @throws Exception
     */
    public void updateUserAccount(Long orderId) throws Exception {
        RechargeOrderEntity rechargeOrderEntity = rechargeOrderRepository.queryOrderById(orderId);
        if (rechargeOrderEntity == null) {
            throw new BusinessException(ErrorConstant.RECHARGE_ORDER_IS_NULL_ERROR, ErrorConstant.RECHARGE_ORDER_IS_NULL_ERROR_MSG);
        }
        BigDecimal changeAmount = rechargeOrderEntity.getRechargeMoney();
        AccountEntity accountEntity = accountDao.queryUserAccountByUserId(rechargeOrderEntity.getUserId());
        if (null == accountEntity) {
            accountEntity = new AccountEntity();
            accountEntity.setId(idWorker.nextId());
            accountEntity.setUserId(rechargeOrderEntity.getUserId());
            accountEntity.setAccountNum(changeAmount);
        } else {
            accountEntity.setAccountNum(accountEntity.getAccountNum().add(changeAmount));
        }
        accountDao.saveAndFlush(accountEntity);

        insertUserAccountWater(rechargeOrderEntity.getUserId(), (byte) 1, changeAmount, orderId);
    }

    /**
     * 增加交易流水信息
     *
     * @param userId    用户主键
     * @param waterType 流水类型：1 充值, 0消费,2代金券
     * @param waterNum  交易金额
     * @throws Exception
     */
    private void insertUserAccountWater(String userId, byte waterType, BigDecimal waterNum, Long orderId) throws Exception {
        AccountWaterEntity accountWaterEntity = new AccountWaterEntity();
        accountWaterEntity.setWaterId(idWorker.nextId());
        accountWaterEntity.setWaterType(waterType);
        accountWaterEntity.setUserId(userId);
        accountWaterEntity.setOrderId(orderId);
    }
}
