package com.smart.program.request.account;

public interface UserAccountService {

    /**
     * 修改用户现金账户信息
     *
     * @param orderId
     * @throws Exception
     */
    void updateUserAccount(Long orderId) throws Exception;

}
