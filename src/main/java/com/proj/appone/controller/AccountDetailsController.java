package com.proj.appone.controller;

import com.proj.appone.entities.AccountDetails;
import com.proj.appone.service.AccountDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountDetailsController {

    @Autowired
    private AccountDetailsServiceImpl accountDetailsService;

    @GetMapping("/accounts")
    public List<AccountDetails> getAllAccounts(){
        return accountDetailsService.getAllAccounts();
    }

    @GetMapping("/account")
    public AccountDetails getAccount(@RequestHeader Long accountNumber){
        return accountDetailsService.getAccount(accountNumber);
    }
}
