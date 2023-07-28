package com.example.demologinapi.controller;

import com.example.demologinapi.model.Account;
import com.example.demologinapi.model.dto.AccountDTO;
import com.example.demologinapi.model.dto.AccountMapper;
import com.example.demologinapi.service.AccountServiceImpl;
import com.example.demologinapi.service.IAccountService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountControllerAPI {
    @Autowired
    IAccountService accountService;
    @Autowired
    HttpSession httpSession;

//    @PostMapping("/login")
//    public AccountDTO getLogin(@RequestBody Account account){
//        Account account1 = accountService.getAccountLogin(account.getUsername(), account.getPassword());
//        if (account1 != null){
//            httpSession.setAttribute("account", account1);
//        }
//        AccountMapper mapper = Mappers.getMapper(AccountMapper.class);
//        AccountDTO accountDTO = mapper.accountToAccountDTO(account1);
//        return accountDTO;
//    }
    @PostMapping("/register")
    public Account register(@RequestBody Account account){
        return account;
    }

    @GetMapping
    public List<Account> getAll(){
        return accountService.getAll();
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
