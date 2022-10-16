package com.example.feign;

import com.example.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)    //服务提供者在注册中心的名称
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
