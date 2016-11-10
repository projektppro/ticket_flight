package com.ppro.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.ppro")
@EnableJpaRepositories(basePackages = "com.ppro.dao")
@EntityScan(basePackages = "com.ppro.model")
public class TicketFlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketFlightApplication.class, args);
	}
}
