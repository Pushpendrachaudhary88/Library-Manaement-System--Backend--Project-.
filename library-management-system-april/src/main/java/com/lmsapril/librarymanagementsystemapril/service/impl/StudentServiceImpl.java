package com.lmsapril.librarymanagementsystemapril.service.impl;

import com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos.StudentRequestDto;
import com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos.UpdateStudentMobRequestDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.CardResponseDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.StudentResponseDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.UpdateStudentMobResponseDto;
import com.lmsapril.librarymanagementsystemapril.entity.Card;
import com.lmsapril.librarymanagementsystemapril.entity.Student;
import com.lmsapril.librarymanagementsystemapril.enums.CardStatus;
import com.lmsapril.librarymanagementsystemapril.exceptions.StudentNotFoundException;
import com.lmsapril.librarymanagementsystemapril.repository.StudentRepository;
import com.lmsapril.librarymanagementsystemapril.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public String addStudent(StudentRequestDto studentRequestDto) {

        //generated new card for the student
       // Card card = new Card();
        //card.setCardStatus(CardStatus.ACTIVATED);
       // card.setValidTill("2024-01-01");
       // card.setStudent(student);

        //set the card for the student
        //student .setCard(card);
       // studentRepository.save(student);
      //  return "Student added successfully";

        Student student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setName(studentRequestDto.getName());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setMobNo(studentRequestDto.getMobNo());

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("2024-01-01");
        card.setStudent(student);

        student.setCard(card);
        studentRepository.save(student);

        return "Student added";
        }

    @Override
    public StudentResponseDto getStudentById(int id) {
        Student student = studentRepository.findById(id).get();

        // prepare responsedto
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(student.getId());
        studentResponseDto.setName(student.getName());
        studentResponseDto.setDepartment(student.getDepartment());
        studentResponseDto.setAge(student.getAge());
        studentResponseDto.setMobNo(student.getMobNo());

        CardResponseDto cardResponseDto = new CardResponseDto();
        cardResponseDto.setIssueDate(student.getCard().getIssueDate());
        cardResponseDto.setCardStatus(student.getCard().getCardStatus());
        cardResponseDto.setUpdatedOn(student.getCard().getUpdatedOn());
        cardResponseDto.setValidTill(student.getCard().getValidTill());
        cardResponseDto.setId(student.getCard().getId());

        studentResponseDto.setCardResponseDto(cardResponseDto);
        return studentResponseDto;
    }


    @Override
    public UpdateStudentMobResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException {
        // first we check is student is exit or not.

        try{
            Student student = studentRepository.findById(updateStudentMobRequestDto.getId()).get();
            student.setMobNo(updateStudentMobRequestDto.getMobNo());
            Student updatedStudent = studentRepository.save(student);

            // prepare response dto
            UpdateStudentMobResponseDto updateStudentMobResponseDto = new UpdateStudentMobResponseDto();
            updateStudentMobResponseDto.setName(updatedStudent.getName());
            updateStudentMobResponseDto.setMobNo(updateStudentMobResponseDto.getMobNo());
            return updateStudentMobResponseDto;
        }
        catch(Exception e){
            throw new StudentNotFoundException("Invalid student id");
        }
    }

}
