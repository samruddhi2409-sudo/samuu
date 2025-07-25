

package com.example.samuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "index";  // make sure there's an index.html in src/main/resources/templates if you're using Thymeleaf
    }
}
