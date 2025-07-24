package com.example.samuu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! Samruddhi Mahajan from spring boot";
    }
    
    @GetMapping("/samu")
    public String saySamu() {
        return " Samruddhi Ramchandra Mahajan from spring boot";
    }
}

