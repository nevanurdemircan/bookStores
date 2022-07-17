package com.example.bookstores.controller;

import com.example.bookstores.entities.BookStore;
import com.example.bookstores.service.BookStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book-store")
@RequiredArgsConstructor
public class BookStoreController {
    private final BookStoreService bookStoreService;

    @GetMapping ("fetch-all")
    public List<BookStore> allBookStore(){
        return this.bookStoreService.findAll();
    }
    @GetMapping("fetch-one")
    public BookStore fetchOne(@RequestParam Long id){
        return this.bookStoreService.findOne(id);
    }
    @PostMapping("save")
    public BookStore save(@RequestBody BookStore bookStore){
        return this.bookStoreService.save(bookStore);
    }
    @PutMapping("update")
    public BookStore update(@RequestBody BookStore bookStore){
        return this.bookStoreService.update(bookStore);
    }
    @DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody BookStore bookStore){
        this.bookStoreService.delete(bookStore);
        return new ResponseEntity(HttpStatus.OK);
    }


}

