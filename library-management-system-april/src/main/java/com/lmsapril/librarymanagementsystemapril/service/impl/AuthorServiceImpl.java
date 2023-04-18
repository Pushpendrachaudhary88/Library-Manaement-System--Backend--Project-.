package com.lmsapril.librarymanagementsystemapril.service.impl;

import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.AuthorResponseDto;
import com.lmsapril.librarymanagementsystemapril.entity.Author;
import com.lmsapril.librarymanagementsystemapril.repository.AuthorRepository;
import com.lmsapril.librarymanagementsystemapril.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author added";
    }

    @Override
    public AuthorResponseDto getByEmail(String email) {
        Author author = authorRepository.findByEmail(email);
        // prepare response dto

        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        authorResponseDto.setName(author.getName());
        authorResponseDto.setAge(author.getAge());

        return authorResponseDto;
    }
}
