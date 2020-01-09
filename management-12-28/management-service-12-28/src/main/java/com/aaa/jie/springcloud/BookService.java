package com.aaa.jie.springcloud;

import com.aaa.jie.springcloud.mapper.BookMapper;
import com.aaa.jie.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有信息
     * @return
     */
    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }
}
