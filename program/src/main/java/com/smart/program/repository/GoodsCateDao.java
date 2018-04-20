package com.smart.program.repository;

import com.smart.program.domain.GoodsCateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsCateDao extends JpaRepository<GoodsCateEntity, Long> {

}
