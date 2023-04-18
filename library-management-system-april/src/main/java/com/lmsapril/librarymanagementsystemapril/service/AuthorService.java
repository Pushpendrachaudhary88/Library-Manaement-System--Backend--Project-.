package com.lmsapril.librarymanagementsystemapril.service;

import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.AuthorResponseDto;
import com.lmsapril.librarymanagementsystemapril.entity.Author;
public interface AuthorService {
    public default String addAuthor(Author author) {
        return null;
    }


  public   AuthorResponseDto getByEmail(String email);
}
