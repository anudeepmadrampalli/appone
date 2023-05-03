package com.proj.appone.service;

import com.proj.appone.entities.AccountDetails;
import com.proj.appone.repository.AccountDetailsRepo;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService{

    private final AccountDetailsRepo accountDetailsRepo;

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

    @Override
    public void createAccounts(){
        AccountDetails accountDetails1 = AccountDetails.builder()
                .accountNumber(12345678L)
                .bsb(81234L)
                .createOn(Date.valueOf(LocalDate.now()))
                .status("OPEN")
                .build();
        AccountDetails accountDetails2 = AccountDetails.builder()
                .accountNumber(87654321L)
                .bsb(80099L)
                .createOn(Date.valueOf(LocalDate.now()))
                .status("OPEN")
                .build();
        accountDetailsRepo.saveAll(Arrays.asList(accountDetails1, accountDetails2));
    }
}
