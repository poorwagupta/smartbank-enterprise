package com.sneha.smartbank.controller;

import com.sneha.smartbank.dto.TransactionRequest;
import com.sneha.smartbank.service.TransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @PostMapping
    public ResponseEntity<UUID> createTransaction(
    @Valid @RequestBody TransactionRequest request) {

        return ResponseEntity.ok(
                service.createTransaction(request)
        );   }
}
