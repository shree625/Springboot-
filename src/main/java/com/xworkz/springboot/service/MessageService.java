package com.xworkz.springboot.service;

import com.xworkz.springboot.dto.MessageDTO;
import com.xworkz.springboot.entity.MessageEntity;

public interface MessageService {
	public MessageEntity validateAndSaveMessage(MessageDTO messageDto);
	
}
