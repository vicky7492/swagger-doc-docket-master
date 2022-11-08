package com.spring.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSwaggerDemoApplication {
	
	@Autowired
	private EmployeeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringSwaggerDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			repo.save(new Employee("John", 20010L));
			repo.save(new Employee("Peter", 20010L));
			repo.save(new Employee("Sam", 20010L));
		};
	}
	
}
