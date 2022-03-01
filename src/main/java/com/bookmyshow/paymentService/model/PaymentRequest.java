package com.bookmyshow.paymentService.model;

import org.springframework.stereotype.Component;

@Component
public class PaymentRequest {

    private String userName;

    private String amount;

    public PaymentRequest() {
    }

    public PaymentRequest(String userName, String amount) {
        this.userName = userName;
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
