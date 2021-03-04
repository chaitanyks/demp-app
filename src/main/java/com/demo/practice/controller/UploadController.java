package com.demo.practice.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
public class UploadController {
    @GetMapping(value = "/api/download/{uuid}")
    public String DownloadFile(MultipartFile multipartFile){

        String str = "This is the new row";
        return str;
    }

    @PostMapping(value = "/upload")
    public void UploadFile(@RequestParam("myFile") MultipartFile file) throws IOException {
//        Date date = new Date();
        File temfile = File.createTempFile("temp","date");
        file.transferTo(temfile);
    }
}
