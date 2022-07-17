package com.example.bookstores.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="author_name")
    private String authorName;

    @Column(name="publisher")
    private String publisher;

    private boolean isReady;

    private Date returnDate;

    @ManyToOne
    @JoinColumn(name = "bookStore_id")
    private BookStore bookStore;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
