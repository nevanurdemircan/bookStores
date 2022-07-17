package com.example.bookstores.controller;

import com.example.bookstores.entities.Book;
import com.example.bookstores.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("book")
@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("save")
    public Book save (@RequestBody Book book){
        return this.bookService.save(book);
    }
    @GetMapping("fetch-all")
    public List<Book>allBook(){
        return this.bookService.findAll();
    }
    @GetMapping("fetch-one")
    public Book fetchOne(@RequestParam Long id){
        return this.bookService.findOne(id);
    }
    @PutMapping("update")
    public Book update(@RequestBody Book book){
        return this.bookService.update(book);
    }
    @DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody Book book){
        this.bookService.delete(book);
       return new ResponseEntity(HttpStatus.OK);
    }
}
