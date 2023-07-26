package com.example.demologinapi.controller;

import com.example.demologinapi.model.Account;
import com.example.demologinapi.service.AccountServiceImpl;
import com.example.demologinapi.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/accounts")
public class AccountControllerAPI {
    @Autowired
    IAccountService accountService;
    @Autowired
    HttpSession httpSession;

    @PostMapping("/login")
    public Account getLogin(@RequestBody Account account){
        Account account1 = accountService.getAccountLogin(account.getUsername(), account.getPassword());
        if (account1 != null){
            httpSession.setAttribute("account", account1);
        }
        return account1;
    }
    @PostMapping("/register")
    public Account register(@RequestBody Account account){
//        code luu account vaof csdl.
        return account;
    }
}
