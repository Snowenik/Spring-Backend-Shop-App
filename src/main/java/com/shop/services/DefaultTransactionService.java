package com.shop.services;

import com.shop.dto.UserTransactionDTO;
import com.shop.entities.Transaction;
import com.shop.entities.UserRepository;
import com.shop.exceptions.UserDoesntExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DefaultTransactionService implements TransactionService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public List<Transaction> getUserTransactions(UserTransactionDTO userTransactionDTO) throws UserDoesntExistException {
        if (!userRepository.existsById(userTransactionDTO.getUserId())) {
            throw new UserDoesntExistException("User o id: " + userTransactionDTO.getUserId() + " nie istnieje");
        }
        userRepository.findById(userTransactionDTO.getUserId()).get().getTransactions().size();
        List<Transaction> transactions = userRepository.findById(userTransactionDTO.getUserId()).get().getTransactions();
        for (Transaction transaction : transactions) {
            transaction.getProductList().size();
        }
        return userRepository.findById(userTransactionDTO.getUserId()).get().getTransactions();
    }
}






















