package com.example.familybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = {"com.example.familybackend"})
public class FamilyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyBackendApplication.class, args);
	}

}
