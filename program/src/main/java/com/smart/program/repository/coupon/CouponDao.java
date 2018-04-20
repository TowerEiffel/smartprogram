package com.smart.program.repository.coupon;

import com.smart.program.domain.coupon.CouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponDao extends JpaRepository<CouponEntity, Long> {

}
