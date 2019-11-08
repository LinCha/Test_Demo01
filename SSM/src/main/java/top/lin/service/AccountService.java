package top.lin.service;

import top.lin.entity.Account;

import java.util.List;

public interface AccountService {
    //查询所有账户
    List<Account> finAll();

    //保存账户信息
    void saveAccount(Account account);
}
