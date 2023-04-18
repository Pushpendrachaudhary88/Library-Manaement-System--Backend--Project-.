package com.lmsapril.librarymanagementsystemapril.repository;

import com.lmsapril.librarymanagementsystemapril.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
