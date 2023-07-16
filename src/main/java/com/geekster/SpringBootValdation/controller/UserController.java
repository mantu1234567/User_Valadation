package com.geekster.SpringBootValdation.controller;

import com.geekster.SpringBootValdation.service.UserService;
import com.geekster.SpringBootValdation.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("add/user")

    public String addUser(@Valid @RequestBody User user){
       return userService.addUser(user);
    }
    @GetMapping("get/all")
    public List<User> getAll(){
        return userService.getAll();
    }
}
