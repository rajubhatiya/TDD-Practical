package com.tdd.rbhatiya.practical.controller;


import com.tdd.rbhatiya.practical.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Rajesh", "Bhatiya", "Admin"));
        users.add(new User(2, "Manish", "Chaudhary", "Customer"));
        return users;
    }
}
