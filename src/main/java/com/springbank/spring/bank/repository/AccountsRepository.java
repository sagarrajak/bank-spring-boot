package com.springbank.spring.bank.repository;

import com.springbank.spring.bank.entites.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
