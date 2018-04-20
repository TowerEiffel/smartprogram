package com.smart.program.repository.account;


import com.smart.program.domain.account.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<AccountEntity, Long> {

}
