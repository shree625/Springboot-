package com.xworkz.springboot.controller;

import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springboot.dto.AppInfoDTO;
import com.xworkz.springboot.dto.EnvironmentDTO;
import com.xworkz.springboot.dto.MessageDTO;
import com.xworkz.springboot.entity.MessageEntity;
import com.xworkz.springboot.service.AppInfoService;
import com.xworkz.springboot.service.MessageService;

@Controller
public class MessageController {
	private static final Logger logger = Logger.getLogger(MessageController.class);

	private List<EnvironmentDTO> environmentDTO;
	@Autowired
	private MessageService messageService;

	@Autowired
	private AppInfoService appInfoService;

	public MessageController() {
		logger.info("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("onclick")
	public String onClick() {
		logger.info("Invoked onClick");
		return "ViewPage";
	}

	@RequestMapping("onlanding")
	public String saveMessageCredentials(MessageDTO messageDto, Model model) {
		logger.info("Started: saveMessageCredentials method of MessageController" + messageDto);
		try {

			logger.info("Invoked view page ");

			if (Objects.nonNull(messageDto)) {

				MessageEntity fetechedMessage = messageService.validateAndSaveMessage(messageDto);
				logger.info(fetechedMessage);

				model.addAttribute("Name", messageDto.getFromName());
				model.addAttribute("message", messageDto.getMessage());
				logger.info("Directing to greeting.jsp");
				return "GreetMessage";
			} else {
				logger.error("Message not valid");
				model.addAttribute("Error", "check the credentials you entered");
				return "ViewPage";
			}
		} catch (Exception e) {
			logger.error("Exception in saveMessageCredentials method of MessageController " + e);
		}
		logger.info("Ended: saveMessageCredentials method of MessageController " + messageDto);
		return "GreetMessage";
	}

	@RequestMapping("login")
	public String onLogin(AppInfoDTO appInfoDTO, Model model) {
		try {
			logger.info("Invoked onLogin() from " + this.getClass().getSimpleName());
			String check = null;
			logger.info("Dto is : " + appInfoDTO);
			check = appInfoService.validateAndSave(appInfoDTO, environmentDTO);
			environmentDTO.removeAll(environmentDTO);
			logger.info("Status is " + check);
			model.addAttribute("status", check);
		} catch (Exception e) {
			logger.error("Error in onLogin() from " + this.getClass().getSimpleName(), e);
		}
		return "App-Info";
	}
	
	@RequestMapping("addEnv")
	public String onAdding(EnvironmentDTO environmentDTO1) {
		
	try {
		logger.info("Invoked onAdding() from "+this.getClass().getSimpleName());
		
		logger.info("Env name : "+environmentDTO1.getEnvValue());
		logger.info("Url : "+environmentDTO1.getUrl());
		environmentDTO.add(environmentDTO1);
		environmentDTO.forEach(p->System.out.println(p));
		return "App-Info";
	}catch (Exception e) {
		logger.error("Error in onAdding from " + this.getClass().getSimpleName(), e);
	}
	return "EnvironmentAddition";
}
}
