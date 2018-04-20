package com.smart.program.repository.account;

import com.smart.program.domain.account.AccountWaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountWaterDao extends JpaRepository<AccountWaterEntity, Long> {

}
