package com.proj.appone.controller;

import com.proj.appone.entities.AccountDetails;
import com.proj.appone.service.AccountDetailsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
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

    @PutMapping("/init")
    public ResponseEntity<HttpStatus> createAccount(){
        log.info("*****Creating accounts*****");
        accountDetailsService.createAccounts();
        log.info("*****Accounts Created*****");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
