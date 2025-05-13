package com.example.pasir_soltykiewicz_jakub.repository;

import com.example.pasir_soltykiewicz_jakub.model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DebtRepository extends JpaRepository<Debt, Long> {
    List<Debt> findByGroupId(Long groupId);
}
