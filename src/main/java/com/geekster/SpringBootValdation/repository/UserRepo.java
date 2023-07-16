package com.geekster.SpringBootValdation.repository;

import com.geekster.SpringBootValdation.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {

    List<User> userList = new ArrayList<>();

    public String addUser(User user) {
        userList.add(user);
        return "add user done";
    }


    public List<User> getAll() {
        return userList;
    }
}
