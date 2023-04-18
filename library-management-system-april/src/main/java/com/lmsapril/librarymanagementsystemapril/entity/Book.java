package com.lmsapril.librarymanagementsystemapril.entity;

import com.lmsapril.librarymanagementsystemapril.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private int noOfPages;

    private int price;

    private boolean isIssued = false;

    @ManyToOne
    @JoinColumn
    Author author;

    @ManyToOne
    @JoinColumn
    Card card;


    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    List<Transaction> transactionList = new ArrayList<>();

}
