package com.atguigu.service.impl;

import com.atguigu.bean.Account;
import com.atguigu.dao.AccountDao;
import com.atguigu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Administrator
 * @date : 2020-11-10 14:42
 * @description ：
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户。。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。。");
        accountDao.saveAccount(account);


    }
}