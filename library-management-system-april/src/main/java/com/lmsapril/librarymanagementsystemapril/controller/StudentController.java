package com.lmsapril.librarymanagementsystemapril.controller;

import com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos.StudentRequestDto;
import com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos.UpdateStudentMobRequestDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.StudentResponseDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.UpdateStudentMobResponseDto;
import com.lmsapril.librarymanagementsystemapril.entity.Student;
import com.lmsapril.librarymanagementsystemapril.exceptions.StudentNotFoundException;
import com.lmsapril.librarymanagementsystemapril.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    // StudentServiceImpl studentServiceImpl;

    @PostMapping("/add-Student")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto ){
        return studentService.addStudent(studentRequestDto);
    }

    @PutMapping("/update_mobile")
    public UpdateStudentMobResponseDto updateMobNo( @RequestBody UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException {
        return studentService.updateMobNo(updateStudentMobRequestDto);
    }
    @GetMapping("/get-student")
    public StudentResponseDto getStudent(@RequestParam("id") int id){
        return studentService.getStudentById(id);
    }

    //delete a stu dent by id
    //update a student by id
    //find a student by id
    //find all the student.



}
