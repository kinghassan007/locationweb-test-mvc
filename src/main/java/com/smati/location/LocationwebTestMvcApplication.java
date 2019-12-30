package com.smati.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class LocationwebTestMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationwebTestMvcApplication.class, args);
	}

}
