package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.BookService;
import com.aaa.jie.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectAll(){
        System.out.println("8083");
        return bookService.selectAll();
    }
}
