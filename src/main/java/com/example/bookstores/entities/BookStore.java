package com.example.bookstores.entities;

import com.sun.org.apache.xalan.internal.xsltc.dom.KeyIndex;
import lombok.*;
import sun.awt.AWTAccessor;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "book_store")
public class BookStore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "bookStore")
    private List<Book> books;
    @ManyToMany(mappedBy = "bookStores")
    private List<User> users;




}
