package com.smart.program.repository.recharge;

import com.smart.program.domain.recharge.RechargeOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RechargeOrderRepository extends JpaRepository<RechargeOrderEntity, Long> {

    /**
     * 修改订单状态为已完成
     *
     * @param orderId
     * @throws Exception
     */
    @Query(value = "update recharge_order set order_status = '1' where order_id = :orderId", nativeQuery = true)
    void updateOrderFinish(@Param("orderId") Long orderId) throws Exception;
}
