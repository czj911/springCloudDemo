package com.example.controller;

import com.example.entity.Student;
import com.example.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.internal.reactivestreams.PublisherAsCompletable;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
