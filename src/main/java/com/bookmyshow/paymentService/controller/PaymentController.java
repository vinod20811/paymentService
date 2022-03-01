package com.bookmyshow.paymentService.controller;

import com.bookmyshow.paymentService.model.PaymentRequest;
import com.bookmyshow.paymentService.model.PaymentResponse;
import com.bookmyshow.paymentService.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    public UserAccountService userAccountService;

    @PostMapping("/credit")
    public PaymentResponse creditAmount(@RequestBody PaymentRequest request){
        return userAccountService.creditAmount(request.getUserName(),request.getAmount());
    }

    @PostMapping("/debit")
    public PaymentResponse debitAmount(@RequestBody PaymentRequest request){
        return userAccountService.debitAmount(request.getUserName(),request.getAmount());
    }
}
