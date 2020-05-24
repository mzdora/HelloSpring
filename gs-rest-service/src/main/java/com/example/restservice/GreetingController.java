package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  //这个注释把类标记为控制器，每个方法均返回domain object而不是view
public class GreetingController {
    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") //可以确保HTTP GET请求到/greeting被映射到greeting()方法
    public Greeting greeting(@RequestParam(value="name",defaultValue ="World")String name){ //RequestParam验证greeting方法中name的值，如果为空则默认为"World"。
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}