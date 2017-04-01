package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example"})
public class SpringBootRestApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApi2Application.class, args);
	}
}
