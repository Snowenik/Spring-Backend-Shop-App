package com.shop.services;

import com.shop.dto.UserTransactionDTO;
import com.shop.entities.Transaction;
import com.shop.exceptions.UserDoesntExistException;

import java.util.List;

public interface TransactionService {


    List<Transaction> getUserTransactions(UserTransactionDTO userTransactionDTO) throws UserDoesntExistException;





}
