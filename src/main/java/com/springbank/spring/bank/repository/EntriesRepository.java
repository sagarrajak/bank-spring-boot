package com.springbank.spring.bank.repository;

import com.springbank.spring.bank.entites.Entries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntriesRepository extends JpaRepository<Entries, Long> {
}
