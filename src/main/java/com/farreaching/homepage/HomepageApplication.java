package com.farreaching.homepage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.farreaching.homepage.mapper")
public class HomepageApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomepageApplication.class, args);
	}
}
