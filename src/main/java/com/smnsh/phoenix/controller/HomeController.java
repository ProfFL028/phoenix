package com.smnsh.phoenix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/404")
    public String err404() {
        return "404";
    }
}
