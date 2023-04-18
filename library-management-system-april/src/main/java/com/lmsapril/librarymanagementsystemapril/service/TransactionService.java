package com.lmsapril.librarymanagementsystemapril.service;

import com.lmsapril.librarymanagementsystemapril.DTO.RequestDtos.IssueBookRequestDto;
import com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos.IssueBookResponseDto;

public interface TransactionService {
    public IssueBookResponseDto issueBook(IssueBookRequestDto issueBookRequestDto) throws Exception;
}
