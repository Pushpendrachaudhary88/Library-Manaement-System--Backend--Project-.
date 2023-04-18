package com.lmsapril.librarymanagementsystemapril.DTO.ResponseDtos;

import com.lmsapril.librarymanagementsystemapril.enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CardResponseDto {

    private int id;


    private Date issueDate;

    private Date updatedOn;

    private CardStatus cardStatus;

    private String validTill;

}
