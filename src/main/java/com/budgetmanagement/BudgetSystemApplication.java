package com.budgetmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(com.budgetmanagement.config.SecurityConfig.class)
public class BudgetSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetSystemApplication.class, args);
	}

}
