package com.book.journey.manager.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * Main class to start journey application.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@ComponentScan(basePackages = {"com.book.*"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.book.*")
@EntityScan(basePackages = {"com.book.*"}) 
@SpringBootApplication
public class JourneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JourneyApplication.class, args);
	}

}
