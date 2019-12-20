package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @GetMapping
    @ResponseBody
    public String hello(){
        return "Hi there, from remote";
    }

    @GetMapping("/a")
    public String a(){
        return "index";
    }
}
