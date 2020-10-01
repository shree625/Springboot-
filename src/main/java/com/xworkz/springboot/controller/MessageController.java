package com.xworkz.springboot.controller;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springboot.dto.MessageDTO;
import com.xworkz.springboot.entity.MessageEntity;
import com.xworkz.springboot.service.MessageService;

@Controller
public class MessageController {
	private static final Logger logger = Logger.getLogger(MessageController.class);

	@Autowired
	private MessageService messageService;

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
}
