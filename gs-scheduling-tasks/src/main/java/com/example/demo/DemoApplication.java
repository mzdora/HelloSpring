package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling; //导入调度

@SpringBootApplication
@EnableScheduling //启动调度
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

}
