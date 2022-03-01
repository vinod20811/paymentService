package com.bookmyshow.paymentService.repository;

import com.bookmyshow.paymentService.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount,Integer> {
    //UserAccount findByUserName(String userName);

//    //@Query("INSERT INTO TRANSACTION (USERNAME,TYPE,TRANSTIME) VALUES (?1,?2,CURRENT_TIMESTAMP())")
//    int creditAmount() ;

    @Modifying
    @Transactional
    @Query(value = "update user_account set balance=balance+?1 where username=?2",nativeQuery = true)
    public int debitAmount(int balance,String username);

    @Modifying
    @Transactional
    @Query(value = "update user_account set balance=balance-?1 where username=?2 and balance > ?1",nativeQuery = true)
    public int creditAmount(int balance,String username);


}
