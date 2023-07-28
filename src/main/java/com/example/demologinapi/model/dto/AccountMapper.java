package com.example.demologinapi.model.dto;

import com.example.demologinapi.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AccountMapper {
    @Mapping(source = "role.name", target = "roleName")
    AccountDTO accountToAccountDTO(Account account);
}
