package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringApp05Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp05Application.class, args);
	}

}
