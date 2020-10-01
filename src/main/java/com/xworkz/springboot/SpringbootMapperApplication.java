package com.xworkz.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMapperApplication {
	private static final Logger logger = Logger.getLogger(SpringbootMapperApplication.class);

	public static void main(String[] args) {

		System.setProperty("server.servlet.context-path", "/springboot-mapper");
		SpringApplication.run(SpringbootMapperApplication.class, args);
		logger.info("SpringbootWebApplication ended");
	}

}
