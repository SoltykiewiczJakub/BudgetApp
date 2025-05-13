package com.example.pasir_soltykiewicz_jakub.controller;

import com.example.pasir_soltykiewicz_jakub.dto.GroupTransactionDTO;
import com.example.pasir_soltykiewicz_jakub.model.User;
import com.example.pasir_soltykiewicz_jakub.service.GroupTransactionService;
import com.example.pasir_soltykiewicz_jakub.service.TransactionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GroupTransactionGraphQLController {

    private final GroupTransactionService groupTransactionService;
    private final TransactionService transactionService;

    public GroupTransactionGraphQLController(GroupTransactionService groupTransacionService, TransactionService transactionService) {
        this.groupTransactionService = groupTransacionService;
        this.transactionService = transactionService;
    }

    @MutationMapping
    public Boolean addGroupTransaction(@Argument GroupTransactionDTO groupTransactionDTO) {
        User user = transactionService.getCurrentUser();
        groupTransactionService.addGroupTransaction(groupTransactionDTO, user);
        return true;
    }
}
