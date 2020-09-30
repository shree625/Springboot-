package com.xworkz.springboot.controller;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springboot.entity.SpringbootEntity;
import com.xworkz.springboot.service.SpringbootService;

@Controller
public class SpringBootController {

	private static final Logger logger = Logger.getLogger(SpringBootController.class);

	@Autowired
	SpringbootService springbootService;

	public SpringBootController() {
		logger.info("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("onDO")
	public String onDO() {
		logger.info("Invoked onDo");
		return "springboot";

	}

	@RequestMapping("springboot")
	public String save(SpringbootEntity springbootEntity, Model model) {
		try {
			logger.info("Started save " + springbootEntity);
			logger.info("Invoked springboot page ");

			if (Objects.nonNull(springbootEntity)) {
				
				SpringbootEntity fetchedEntity= springbootService.save(springbootEntity);
				logger.info(fetchedEntity);

				model.addAttribute("from", springbootEntity.getFromName());
				model.addAttribute("message", springbootEntity.getMessage());
			}
		} catch (Exception e) {
			logger.error("Exception in save controller " + e);

		}
		return "message";
	}
}
