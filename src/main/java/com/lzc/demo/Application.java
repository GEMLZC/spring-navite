package com.lzc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.service.annotation.HttpExchange;

@SpringBootApplication
@HttpExchange
public class Application {

	public static void main(String[] args) {


		SpringApplication.run(Application.class, args);
	}

}
