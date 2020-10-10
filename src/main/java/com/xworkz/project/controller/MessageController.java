package com.xworkz.project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.project.dto.MessageDTO;
//import com.xworkz.project.entity.MessageEntity;
import com.xworkz.project.service.MessageServiceImpl;

@Controller
@RequestMapping("/")
public class MessageController {
	private static final Logger logger = Logger.getLogger(MessageController.class);

	@Autowired
	private MessageServiceImpl messageService;

	public MessageController() {
		logger.info(this.getClass().getSimpleName() + " is created.!!");
	}

	@RequestMapping("onWelcome")
	public String postMessage(MessageDTO messageDTO, Model model) {
		logger.info("invoking postMessage() from " + this.getClass().getSimpleName());
		try {
			logger.info("Calling the service class of message");
			messageDTO = messageService.convertAndSaveMessageDetails(messageDTO);
			if (messageDTO.getId() != null) {
				logger.info("data is valid");
				
				model.addAttribute("id", messageDTO.getId());
				model.addAttribute("message", messageDTO.getMessage());
				model.addAttribute("from", messageDTO.getFrom());
				return "Success";
			} else {
				logger.info("data is invalid");
				model.addAttribute("errorMessage", "data is not getting saved ");
				return "Welcome";
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "Welcome";

	}
}
