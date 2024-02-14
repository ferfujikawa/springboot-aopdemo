package com.luv2code.springbootaopdemo.dao;

import com.luv2code.springbootaopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);
}
