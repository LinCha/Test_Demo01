package top.lin.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lin.entity.Account;
import top.lin.mapper.AccountMapper;
import top.lin.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> finAll() {
        System.out.println("业务层：查询所有账户...");
        return accountMapper.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户...");
        accountMapper.saveAccount(account);
    }
}
