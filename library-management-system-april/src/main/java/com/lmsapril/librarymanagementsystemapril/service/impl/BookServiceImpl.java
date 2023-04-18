package com.lmsapril.librarymanagementsystemapril.service.impl;

import com.lmsapril.librarymanagementsystemapril.entity.Author;
import com.lmsapril.librarymanagementsystemapril.entity.Book;
import com.lmsapril.librarymanagementsystemapril.repository.AuthorRepository;
import com.lmsapril.librarymanagementsystemapril.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BookServiceImpl implements BookService {
    @Autowired
    AuthorRepository authorRepository;
    @Override
    public String addBook(Book book) throws Exception {
        Author author;
        try{
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch(Exception e){
            throw new Exception("Author not Present");
        }
        author.getBooks().add(book);
        book.setAuthor(author);

        authorRepository.save(author);
        return "BOOK ADDED";

    }
}
