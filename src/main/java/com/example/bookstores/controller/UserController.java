package com.example.bookstores.controller;

import com.example.bookstores.entities.User;
import com.example.bookstores.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("fetch-all")
    public List<User>allUser(){
        return this.userService.findAll();

    }
    @PostMapping("save")
    public User save(@RequestBody User user){
        return this.userService.save(user);
    }
    @GetMapping("fetch-one")
    public User fetchOne(@RequestParam Long id){
        return this.userService.findOne(id);
    }
    @DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody User user){
        this.userService.delete(user);
        return new ResponseEntity (HttpStatus.OK);
    }
    @PutMapping("update")
    public User update(@RequestBody User user){
        return this.userService.update(user);
    }





}
