package com.proj.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class ApponeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApponeApplication.class, args);
	}

}
