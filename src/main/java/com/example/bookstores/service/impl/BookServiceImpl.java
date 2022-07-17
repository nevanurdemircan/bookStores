package com.example.bookstores.service.impl;

import com.example.bookstores.entities.Book;
import com.example.bookstores.repository.BookRepository;
import com.example.bookstores.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book entity){

        Book book=this.bookRepository.save(entity);
        return book;
    }
    @Override
    public void delete(Book entity){
        this.bookRepository.delete(entity);
    }
    @Override
    public Book update(Book entity){
      return this.bookRepository.save(entity);
    }
    @Override
    public Book findOne(Long aLong){
        return this.bookRepository.findById(aLong).get();
    }
    @Override
    public List<Book> findAll(){
        return this.bookRepository.findAll();
    }



    }




