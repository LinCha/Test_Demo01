package top.lin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lin.entity.Account;
import top.lin.service.AccountService;

import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户...");
        //调用service方法
        List<Account> accounts = accountService.finAll();
        model.addAttribute("accounts",accounts);
        System.out.println(accounts);
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account)  {
        accountService.saveAccount(account);
        System.out.println(account);
        return "forward:/account/findAll";
    }
}
