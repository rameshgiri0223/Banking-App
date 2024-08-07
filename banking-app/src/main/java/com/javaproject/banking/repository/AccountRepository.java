package com.javaproject.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
