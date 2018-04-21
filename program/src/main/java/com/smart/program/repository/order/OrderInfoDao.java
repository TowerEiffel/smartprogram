package com.smart.program.repository.order;

import com.smart.program.domain.order.OrderInfoEntity;
import com.smart.program.request.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderInfoDao extends JpaRepository<OrderInfoEntity, Long> {

    /**
     * 获取用户已支付订单信息
     *
     * @param request
     * @return
     * @throws Exception
     */
    @Query(value = "select order from OrderInfoEntity order where order.user = :#{#request.userId} and order.payStatus = '1' and order.dataStatus = '1'")
    List<OrderInfoEntity> findPayOrderByUserId(@Param("request") UserRequest request) throws Exception;

    /**
     * 获取用户待支付订单信息
     *
     * @param request
     * @return
     * @throws Exception
     */
    @Query(value = "select order from OrderInfoEntity order where order.user = :#{#request.userId} and order.payStatus = '0' and order.dataStatus = '1'")
    List<OrderInfoEntity> findUnPayOrderByUserId(@Param("request") UserRequest request) throws Exception;

    /**
     * 获取用户已取消支付订单信息
     *
     * @param request
     * @return
     * @throws Exception
     */
    @Query(value = "select order from OrderInfoEntity order where order.user = :#{#request.userId} and order.payStatus = '2' and order.dataStatus = '1'")
    List<OrderInfoEntity> findCancelOrderByUserId(@Param("request") UserRequest request) throws Exception;
}
