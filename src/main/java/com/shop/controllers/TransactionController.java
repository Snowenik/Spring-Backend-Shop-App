package com.shop.controllers;

import com.shop.dto.UserTransactionDTO;
import com.shop.entities.Transaction;
import com.shop.exceptions.UserDoesntExistException;
import com.shop.services.DefaultTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TransactionController {


    @Autowired
    private DefaultTransactionService defaultTransactionService;


    @PostMapping("/user/transactions")
    public @ResponseBody
    List<Transaction> getUserTransactions(@RequestBody UserTransactionDTO userTransactionDTO) throws UserDoesntExistException {
        return defaultTransactionService.getUserTransactions(userTransactionDTO);
    }


}
