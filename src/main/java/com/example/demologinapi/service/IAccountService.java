package com.example.demologinapi.service;

import com.example.demologinapi.model.Account;

public interface IAccountService {
    Account getAccountLogin(String username, String password);
}
