package com.charandeepmatta.server;

import static org.springframework.boot.Banner.Mode.OFF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SweetBootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SweetBootApplication.class);
		app.setBannerMode(OFF);
		app.run(args);
	}

}
