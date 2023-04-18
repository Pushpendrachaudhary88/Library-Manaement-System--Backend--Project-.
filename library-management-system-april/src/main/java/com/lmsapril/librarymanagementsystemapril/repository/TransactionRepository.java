package com.lmsapril.librarymanagementsystemapril.repository;

import com.lmsapril.librarymanagementsystemapril.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
