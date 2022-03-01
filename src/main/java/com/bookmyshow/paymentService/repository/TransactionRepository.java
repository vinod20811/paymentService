package com.bookmyshow.paymentService.repository;

import com.bookmyshow.paymentService.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
//    @Query("INSERT INTO TRANSACTION (USERNAME,TYPE,TRANSTIME,AMOUNT) VALUES (?1,?2,CURRENT_TIMESTAMP(),?3)")
//    Transaction createTransaction(String username,char type, int amount);
}
