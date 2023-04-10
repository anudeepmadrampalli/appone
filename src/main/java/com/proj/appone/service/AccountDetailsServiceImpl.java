package com.proj.appone.service;

import com.proj.appone.entities.AccountDetails;
import com.proj.appone.repository.AccountDetailsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService{

    private AccountDetailsRepo accountDetailsRepo;

    public AccountDetailsServiceImpl(AccountDetailsRepo accountDetailsRepo){
        this.accountDetailsRepo = accountDetailsRepo;
    }
    @Override
    public List<AccountDetails> getAllAccounts() {
        return (List<AccountDetails>) accountDetailsRepo.findAll();
    }

    @Override
    public AccountDetails getAccount(Long accountNumber) {
        return accountDetailsRepo.findByAccountNumber(accountNumber);
    }
}
