package com.budgetmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.budgetmanagement.repository")
@EntityScan(basePackages = "com.budgetmanagement.entity")
@Import(com.budgetmanagement.config.SecurityConfig.class)
public class BudgetSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetSystemApplication.class, args);
	}

}
