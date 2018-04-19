package com.smart.program.repository;

import com.smart.program.domain.AccountEntity;
import com.smart.program.domain.AccountWaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountWaterDao extends JpaRepository<AccountWaterEntity, Long> {

}
