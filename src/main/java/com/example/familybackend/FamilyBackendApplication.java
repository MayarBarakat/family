package com.example.familybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FamilyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyBackendApplication.class, args);
	}

}
