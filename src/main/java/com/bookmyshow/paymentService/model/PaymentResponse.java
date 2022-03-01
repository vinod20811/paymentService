package com.bookmyshow.paymentService.model;

public class PaymentResponse {

    private String status;

    private String userName;

    private long transactionId;

    private int amount;
    public PaymentResponse() {
    }

    public PaymentResponse(String status, String userName, long transactionId, int amount) {
        this.status = status;
        this.userName = userName;
        this.transactionId = transactionId;
        this.amount=amount;
    }

    public PaymentResponse(String status, String userName, int amount) {
        this.status = status;
        this.userName = userName;
        this.amount=amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
}
