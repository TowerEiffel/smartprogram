package com.smart.program.repository;

import com.smart.program.domain.CouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponDao extends JpaRepository<CouponEntity, Long> {

}
