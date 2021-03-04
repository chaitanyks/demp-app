package com.demo.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("greeting")
    public String getString(){
        String abc = "greeting";
        return abc;
    }
}
