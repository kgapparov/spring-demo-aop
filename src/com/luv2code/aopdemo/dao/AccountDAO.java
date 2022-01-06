package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(){
        System.out.println(getClass() + "Adding account to db!");
    }
    public void addAccount(Account account) {
        System.out.println(getClass() + ": Doing my DB Work: Adding an Account");
    }

}
