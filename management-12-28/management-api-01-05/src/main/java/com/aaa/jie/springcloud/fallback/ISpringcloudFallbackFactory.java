package com.aaa.jie.springcloud.fallback;

import com.aaa.jie.springcloud.model.Book;
import com.aaa.jie.springcloud.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ISpringcloudFallbackFactory implements FallbackFactory<ISpringCloudService> {
    public ISpringCloudService create(Throwable throwable) {
        ISpringCloudService springCloudService = new ISpringCloudService() {
            public List<Book> selectAll() {
                System.out.println("我是熔断测试，ISpringCloudService里的方法");
                return null;
            }
        };
        return springCloudService;
    }
}
