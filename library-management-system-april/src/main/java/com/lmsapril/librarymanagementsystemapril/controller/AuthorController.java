package com.lmsapril.librarymanagementsystemapril.controller;

import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.AuthorResponseDto;
import com.lmsapril.librarymanagementsystemapril.entity.Author;
import com.lmsapril.librarymanagementsystemapril.repository.AuthorRepository;
import com.lmsapril.librarymanagementsystemapril.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/get_by_email")
    public AuthorResponseDto getAuthorByEmail(@RequestParam("email") String email){
        return authorService.getByEmail(email);
    }
    // delete an author by id
    // update the author by id
    //find an author by id
    // find all the author

    //get all the author of a particular age.

}
