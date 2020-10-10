package com.xworkz.project.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.MessageDTO;
import com.xworkz.project.entity.MessageEntity;
import com.xworkz.project.mapper.MessageMapper;
//import com.xworkz.project.entity.MessageEntity;
import com.xworkz.project.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {
	private static final Logger logger = Logger.getLogger(MessageServiceImpl.class);

	@Autowired
	private MessageRepository messageRepository;

	@Autowired
	private MessageMapper messageMapper;

	public MessageServiceImpl() {
		logger.info(this.getClass().getSimpleName() + " is created");
	}
	@Override
	public MessageDTO convertAndSaveMessageDetails(MessageDTO messageDTO) {
		logger.info("invoking convertAndSaveMessageDetails() " + this.getClass().getSimpleName());
		try {
			MessageEntity messageEntity = messageMapper.convertDTOToEntity(messageDTO);
			logger.info("-----------Saving the details of message entity into database---------");
			messageEntity = messageRepository.save(messageEntity);
			if (messageEntity.getId()!= null) {
				messageDTO.setId(messageEntity.getId());
			}
		} catch (Exception e) {
			logger.error("error occurred in convertAndSaveMessageDetails of message service impl"+e.getMessage());
		}
		return messageDTO;
	}
}
