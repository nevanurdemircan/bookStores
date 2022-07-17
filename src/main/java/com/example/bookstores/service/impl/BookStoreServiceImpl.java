package com.example.bookstores.service.impl;

import com.example.bookstores.entities.Book;
import com.example.bookstores.entities.BookStore;
import com.example.bookstores.repository.BookStoreRepository;
import com.example.bookstores.service.BookStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class BookStoreServiceImpl implements BookStoreService {
    private final BookStoreRepository bookStoreRepository;

    @Override
    public BookStore save(BookStore entity){
      return this.bookStoreRepository.save(entity);

    }
    @Override
    public BookStore update(BookStore entity){
        return this.bookStoreRepository.save(entity);
    }
    @Override
    public void delete(BookStore entity){
        this.bookStoreRepository.delete(entity);
    }
    @Override
    public BookStore findOne(Long aLong){
       return this.bookStoreRepository.findById(aLong).get();
    }
    @Override
    public List<BookStore> findAll(){
        return this.bookStoreRepository.findAll();
    }
}
