package com.springbank.spring.bank.services;


import com.springbank.spring.bank.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {
    @Autowired
    private AccountsRepository accountsRepository;




}
