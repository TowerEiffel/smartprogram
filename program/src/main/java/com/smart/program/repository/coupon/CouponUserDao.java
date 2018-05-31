package com.smart.program.repository.coupon;

import com.smart.program.domain.coupon.CouponUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponUserDao extends JpaRepository<CouponUserEntity, Long> {

    @Query(value = "select couponUser from CouponUserEntity couponUser where " +
            "couponUser.couponId = :couponId and couponUser.userId = :userId " +
            "and couponUser.dataStatus = '0'")
    CouponUserEntity queryUserCoupon(@Param("couponId") Long couponId, @Param("userId") String userId) throws Exception;

}
