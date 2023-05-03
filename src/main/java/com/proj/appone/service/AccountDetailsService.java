package com.proj.appone.service;

import com.proj.appone.entities.AccountDetails;

import java.util.List;

public interface AccountDetailsService {

    List<AccountDetails> getAllAccounts();
    AccountDetails getAccount(Long accountNumber);
    void createAccounts();
}
