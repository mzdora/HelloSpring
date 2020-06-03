package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//页面不会受到ScheduledTasks影响
@RestController //控制器
public class hello {
    @GetMapping("/he") //地址映射
    public String he(){
        return "Hello World!";
    }
}