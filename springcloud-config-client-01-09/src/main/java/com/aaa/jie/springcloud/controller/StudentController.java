package com.aaa.jie.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Value("${server.port}")
    private String prot;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @RequestMapping("/test")
    public String SelectProt(){
        return prot+"-------"+driverClassName;
    }
}
