package com.lmsapril.librarymanagementsystemapril.repository;

import com.lmsapril.librarymanagementsystemapril.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
