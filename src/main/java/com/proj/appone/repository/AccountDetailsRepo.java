package com.proj.appone.repository;

import com.proj.appone.entities.AccountDetails;
import org.springframework.data.repository.CrudRepository;

public interface AccountDetailsRepo extends CrudRepository<AccountDetails, Long> {

    AccountDetails findByAccountNumber(Long accountNumber);
}
