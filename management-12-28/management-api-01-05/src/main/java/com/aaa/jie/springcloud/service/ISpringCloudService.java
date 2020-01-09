package com.aaa.jie.springcloud.service;

import com.aaa.jie.springcloud.fallback.ISpringcloudFallbackFactory;
import com.aaa.jie.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "BOOK-PROVIDER" , fallbackFactory = ISpringcloudFallbackFactory.class)
public interface ISpringCloudService {
    @GetMapping("/all")
    List<Book> selectAll();
}
