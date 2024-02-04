package com.springbank.spring.bank.repository;

import com.springbank.spring.bank.entites.Transfers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfers, Long> {
}
