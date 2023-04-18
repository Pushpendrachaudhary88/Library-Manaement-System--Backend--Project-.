package com.lmsapril.librarymanagementsystemapril.service;

import com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos.StudentRequestDto;
import com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos.UpdateStudentMobRequestDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.StudentResponseDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.UpdateStudentMobResponseDto;
import com.lmsapril.librarymanagementsystemapril.entity.Student;
import com.lmsapril.librarymanagementsystemapril.exceptions.StudentNotFoundException;

public interface StudentService {

    public String addStudent(StudentRequestDto studentRequestDto);

    public StudentResponseDto getStudentById(int id);

    public UpdateStudentMobResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException;

}
