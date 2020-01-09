package com.aaa.jie.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @RequestMapping("/all")
    public List<String> selectAllString(){
        List<String> stringList = new ArrayList<String>();
        String str="123456";
        stringList.add(str);
        return stringList;
    }
}
