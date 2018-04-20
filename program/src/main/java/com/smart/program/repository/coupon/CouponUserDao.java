package com.smart.program.repository.coupon;

import com.smart.program.domain.coupon.CouponUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponUserDao extends JpaRepository<CouponUserEntity, Long> {

}
