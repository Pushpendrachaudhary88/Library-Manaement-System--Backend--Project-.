package com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UpdateStudentMobRequestDto {
    private  int id;
    private String mobNo;
}
