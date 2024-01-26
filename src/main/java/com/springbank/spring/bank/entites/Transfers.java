package com.springbank.spring.bank.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "transfers")
@Table(name = "transfers")
public class Transfers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount", nullable = false)
    Long amount;

    @Column(name = "owner", nullable = false)
    private OffsetDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "from_account_id", nullable = false)
    private Accounts fromAccount;

    @ManyToOne
    @JoinColumn(name = "to_account_id", nullable = false)
    private Accounts toAccounts;
}
