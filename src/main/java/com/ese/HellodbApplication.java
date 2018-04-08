package com.ese;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // enable auto-configuration for SpringBoot application
public class HellodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodbApplication.class, args);
	} // Run the server
}
