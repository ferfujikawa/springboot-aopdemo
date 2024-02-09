package com.luv2code.springbootaopdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.springbootaopdemo.dao.AccountDAO;

@SpringBootApplication
public class SpringbootAopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO) {

		return runner -> {

			demoTheBeforeAdvice(theAccountDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO) {
		
		// call the business metho
		theAccountDAO.addAccount();
		
	}

}
