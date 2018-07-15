package com.smnsh.phoenix.controller;

import com.smnsh.phoenix.vo.MessageVO;
import org.springframework.web.bind.annotation.*;

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
