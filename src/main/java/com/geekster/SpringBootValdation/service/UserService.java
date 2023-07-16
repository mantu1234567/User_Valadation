package com.geekster.SpringBootValdation.service;


import com.geekster.SpringBootValdation.model.User;
import com.geekster.SpringBootValdation.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepo userRepo;

    public String addUser(User user) {
        return userRepo.addUser(user);
    }


    public List<User> getAll() {
        return userRepo.getAll();
    }
}
