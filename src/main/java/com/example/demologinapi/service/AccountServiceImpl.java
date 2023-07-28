package com.example.demologinapi.service;

import com.example.demologinapi.model.Account;
import com.example.demologinapi.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService{
    @Autowired
    IAccountRepo iAccountRepo;

    @Override
    public Account getAccountLogin(String username, String password) {
        return iAccountRepo.getAccountLogin(username,password);
    }

    @Override
    public List<Account> getAll() {
        return (List<Account>) iAccountRepo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.getAccountByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(account.getRole());
        return new User(account.getUsername(),account.getPassword(),roles);
    }
}
