package com.sneha.smartbank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    private UUID id;

    private String accountNumber;

    private BigDecimal amount;

    private String transactionType;

    private String status;

    private Integer riskScore;

    private LocalDateTime createdAt;
}