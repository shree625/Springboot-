package com.xworkz.project.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.xworkz.project.entity.MessageEntity;

@Controller
@RequestMapping("/")
public class PageResolver {

	private static final Logger logger = Logger.getLogger(PageResolver.class);
	
	public PageResolver() {
		logger.info("created /t" + this.getClass().getSimpleName());
	}

	@RequestMapping("onWelcome")
	public static String welcomePage() {
		logger.info("invoking indexpage()");
		return "Welcome";
	}
	
}
