package com.miu.edu.cs489.abelibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping(value = { "/", "/home", "/elibrary"})
    public String home() {
        return "home/index";
    }
}
