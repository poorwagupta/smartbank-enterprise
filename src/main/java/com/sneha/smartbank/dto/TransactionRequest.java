package com.sneha.smartbank.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record TransactionRequest(

@NotBlank(message = "Account number is required")
String accountNumber,

@NotNull(message = "Amount is required")
BigDecimal amount,

@NotBlank(message = "Transaction type is required")
String transactionType
) {
}
