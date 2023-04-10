package com.proj.appone.entities;

import com.proj.appone.repository.AccountDetailsRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

@Configuration
public class AccountDetailsConfig {
    private AccountDetailsRepo accountDetailsRepo;

    public AccountDetailsConfig(AccountDetailsRepo accountDetailsRepo){
        this.accountDetailsRepo = accountDetailsRepo;
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
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
        };
    };
}
