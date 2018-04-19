package com.smart.program.repository;

import com.smart.program.domain.DiscountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountDao extends JpaRepository<DiscountEntity, Long> {

}
