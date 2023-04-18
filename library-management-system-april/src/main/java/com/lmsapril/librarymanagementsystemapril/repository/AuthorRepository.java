package com.lmsapril.librarymanagementsystemapril.repository;

import com.lmsapril.librarymanagementsystemapril.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
     Author findByEmail(String email);
}
