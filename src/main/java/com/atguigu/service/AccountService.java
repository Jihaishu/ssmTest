package com.atguigu.service;

import com.atguigu.bean.Account;

import java.util.List;

/**
 * @author : Administrator
 * @date : 2020-11-10 14:41
 * @description ：
 */
public interface AccountService {
    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
