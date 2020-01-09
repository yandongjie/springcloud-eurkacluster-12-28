package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.model.Book;
import com.aaa.jie.springcloud.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private ISpringCloudService springCloudService;

    @GetMapping("/all")
    public List<Book> selectAll() throws Exception {
        return springCloudService.selectAll();
    }
}
