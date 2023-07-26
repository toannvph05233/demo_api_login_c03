package com.example.demologinapi.service;

import com.example.demologinapi.model.Account;
import com.example.demologinapi.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService{
    @Autowired
    IAccountRepo iAccountRepo;

    @Override
    public Account getAccountLogin(String username, String password) {
        return iAccountRepo.getAccountLogin(username,password);
    }
}
