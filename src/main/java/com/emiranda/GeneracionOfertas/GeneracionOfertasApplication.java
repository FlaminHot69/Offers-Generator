package com.emiranda.GeneracionOfertas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneracionOfertasApplication {

	private static final Logger logger = LoggerFactory.getLogger(GeneracionOfertasApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GeneracionOfertasApplication.class, args);
		logger.info("Application started successfully");
	}

}
