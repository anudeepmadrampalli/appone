package com.proj.appone.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Date;

@Data
@SuperBuilder
@Entity
@Table
@RequiredArgsConstructor
public class AccountDetails {

    @Id
    @SequenceGenerator(
            name = "account_details_sequence",
            sequenceName = "account_details_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_details_sequence"
    )
    private Long id;
    private Long accountNumber;
    private Date createOn;
    private long bsb;
    private Date updatedOn;
    private String status;

}
