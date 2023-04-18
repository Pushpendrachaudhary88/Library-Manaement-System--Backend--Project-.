package com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos;

import com.lmsapril.librarymanagementsystemapril.entity.Card;
import com.lmsapril.librarymanagementsystemapril.enums.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentResponseDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;


    private Department department;

    private String mobNo;

    CardResponseDto cardResponseDto;

}

