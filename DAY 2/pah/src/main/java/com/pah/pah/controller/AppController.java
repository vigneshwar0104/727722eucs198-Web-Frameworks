package com.pah.pah.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pah.pah.config.AppConfig;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppController {
    
    @GetMapping("/info")
    public String getMethodName() {
        AppConfig obj = new AppConfig();
        return "StudentName: "+obj.getStudentName()+", Department : "+obj.getStudentDepartment();
    }
    
}
