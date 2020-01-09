package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.BookService;
import com.aaa.jie.springcloud.model.Book;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    //@HystrixCommand(fallbackMethod = "selectAllFallBack")
    public List<Book> selectAllBook() throws Exception {
        List<Book> list= bookService.selectAll();
        if(list.size() > 0){
            throw new Exception("故意抛出异常");
        }
        return list;
    }

//     public List<Book> selectAllFallBack() {
//        List<Book> bookList = new ArrayList<Book>();
//        Book book = new Book();
//        book.setBookId(20000);
//        book.setBookName("测试熔断是否启动");
//        book.setBookPrice(11111111.2);
//        bookList.add(book);
//        return bookList;
//    }
}
