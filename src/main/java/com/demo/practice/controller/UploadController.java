package com.demo.practice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UploadController {
    @GetMapping(value = "/api/download")
    public String downloadFile(){

        return "This is the new row";
    }
}
