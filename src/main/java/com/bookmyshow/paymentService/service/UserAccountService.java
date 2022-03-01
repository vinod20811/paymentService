package com.bookmyshow.paymentService.service;

import com.bookmyshow.paymentService.model.PaymentResponse;
import com.bookmyshow.paymentService.model.Transaction;
import com.bookmyshow.paymentService.model.UserAccount;
import com.bookmyshow.paymentService.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {

    @Autowired
    public UserAccountRepository userAccountRepository;

    @Autowired
    public TransactionService transactionService;


    public PaymentResponse debitAmount(String userName, String amount) {
        int count = userAccountRepository.debitAmount(Integer.parseInt(amount),userName);

        if(count>0){
            Transaction transaction=transactionService.crateTransaction(userName,Integer.parseInt(amount),'D');
            if(transaction.getTransactionId()>0){
                return new PaymentResponse("SUCCESS",userName,transaction.getTransactionId(),Integer.parseInt(amount));
            }
        }
        return new PaymentResponse("FAILURE",userName,Integer.parseInt(amount));
    }

    public PaymentResponse creditAmount(String userName, String amount) {
        int count = userAccountRepository.creditAmount(Integer.parseInt(amount),userName);

        if(count>0){
            Transaction transaction=transactionService.crateTransaction(userName,Integer.parseInt(amount),'C');
            if(transaction.getTransactionId()>0){
                return new PaymentResponse("SUCCESS",userName,transaction.getTransactionId(),Integer.parseInt(amount));
            }
        }
        return new PaymentResponse("FAILURE",userName,Integer.parseInt(amount));
    }
}
