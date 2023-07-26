package com.example.demologinapi.repository;

import com.example.demologinapi.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRoleRepo extends PagingAndSortingRepository<Role, Integer> {
}
