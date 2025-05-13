package com.example.pasir_soltykiewicz_jakub.repository;

import com.example.pasir_soltykiewicz_jakub.model.Transaction;
import com.example.pasir_soltykiewicz_jakub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUser(User user);
}
