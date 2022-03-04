package com.careerdevs.jsonplaceholderspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
//adding a rest controller class.
@RestController
@SpringBootApplication
public class HelloInternet {

	public static void main(String[] args) {
		SpringApplication.run(HelloInternet.class, args);

	}

}
