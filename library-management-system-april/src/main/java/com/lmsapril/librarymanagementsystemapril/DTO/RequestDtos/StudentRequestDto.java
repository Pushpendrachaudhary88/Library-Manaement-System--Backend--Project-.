package com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos;

import com.lmsapril.librarymanagementsystemapril.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentRequestDto {
    private String name;
    private int age;
    private Department department;
    private String mobNo;

}
