package com.example.familybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class },scanBasePackages={
		"com.example.familybackend", "com.example.familybackend"})
@EnableJpaRepositories(basePackages = {"com.example.familybackend.repository"})
public class FamilyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyBackendApplication.class, args);
	}

}
