package com.example.samuu.controller;

import org.springframework.sterotypeController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
@RequestMapping("/")
public String index() {
	return"forward:/index.html";
}
}
