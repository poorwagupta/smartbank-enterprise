package com.sneha.smartbank.service;

import com.sneha.smartbank.dto.TransactionRequest;
import com.sneha.smartbank.entity.Transaction;
import com.sneha.smartbank.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository repository;

    public UUID createTransaction(TransactionRequest request) {

        Transaction transaction = new Transaction();

        transaction.setId(UUID.randomUUID());
        transaction.setAccountNumber(request.accountNumber());
        transaction.setAmount(request.amount());
        transaction.setTransactionType(request.transactionType());
        transaction.setStatus("SUCCESS");
        transaction.setRiskScore(0);
        transaction.setCreatedAt(LocalDateTime.now());

        repository.save(transaction);

        return transaction.getId();
    }
}
