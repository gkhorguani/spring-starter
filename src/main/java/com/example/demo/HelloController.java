package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping(value="/")

    public String hello() {
        return "Hello world";
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        User user = new User();
        user.setName("Giorgi");
        user.setAddress("Tbilisi");

        return user;
    }
    
}