package com.lmsapril.librarymanagementsystemapril.entity;

import com.lmsapril.librarymanagementsystemapril.enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String transactionNumber;

    @CreationTimestamp
    private  Date transactionDate;

    private boolean isIssueOperation;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

   @ManyToOne
   @JoinColumn
   Card card;

   @ManyToOne
   @JoinColumn
   Book book;


}
