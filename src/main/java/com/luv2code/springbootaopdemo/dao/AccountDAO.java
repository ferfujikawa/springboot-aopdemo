package com.luv2code.springbootaopdemo.dao;

import java.util.List;

import com.luv2code.springbootaopdemo.Account;

public interface AccountDAO {

    // add a new method: findAccounts()

    List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    String getName();

    void setName(String name);

    String getServiceCode();

    void setServiceCode(String serviceCode);
}
