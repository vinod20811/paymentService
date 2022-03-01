package com.bookmyshow.paymentService.service;


import com.bookmyshow.paymentService.model.Transaction;
import com.bookmyshow.paymentService.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class TransactionService {

    @Autowired
    public TransactionRepository transactionRepository;

    public Transaction crateTransaction(String userName, int amount, char type) {

        Transaction transaction=new Transaction();
        transaction.setUserName(userName);
        transaction.setAmount(amount);
        transaction.setType(type);
        transaction.setTransTime(new Timestamp(System.currentTimeMillis()));
        return transactionRepository.save(transaction);
    }
}
