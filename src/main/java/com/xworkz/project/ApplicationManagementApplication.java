package com.xworkz.project;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xworkz.project.controller.AppInfoController;

@SpringBootApplication
public class ApplicationManagementApplication {

	private static final Logger logger = Logger.getLogger(AppInfoController.class);

	public static void main(String[] args) {

		System.setProperty("server.servlet.context-path", "/application-management");
		SpringApplication.run(ApplicationManagementApplication.class, args);
	}

}
