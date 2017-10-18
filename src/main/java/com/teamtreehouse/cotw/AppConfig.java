package com.teamtreehouse.cotw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
// Driver class for Spring Boot MVC Thymeleaf project
public class AppConfig {
	public static void main(String[] args){
		SpringApplication.run(AppConfig.class, args);
	}
}
