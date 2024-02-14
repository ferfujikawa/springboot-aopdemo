package com.luv2code.springbootaopdemo.dao;

import org.springframework.stereotype.Repository;

import com.luv2code.springbootaopdemo.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Override
    public void addAccount(Account theAccount) {
        
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");

    }
}
