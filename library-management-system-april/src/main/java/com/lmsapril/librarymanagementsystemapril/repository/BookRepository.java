package com.lmsapril.librarymanagementsystemapril.repository;

import com.lmsapril.librarymanagementsystemapril.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
