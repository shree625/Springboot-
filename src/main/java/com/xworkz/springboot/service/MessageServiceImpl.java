package com.xworkz.springboot.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springboot.customexceptions.MessageEmptyException;
import com.xworkz.springboot.dto.MessageDTO;
import com.xworkz.springboot.entity.MessageEntity;
import com.xworkz.springboot.repository.MessageRepository;

@Service("MessageService")
public class MessageServiceImpl implements MessageService {

	private static final Logger logger = Logger.getLogger(MessageServiceImpl.class);
	@Autowired
	private MessageRepository messageRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public MessageEntity validateAndSaveMessage(MessageDTO messageDto) {
		MessageEntity messageEntity = null;
		logger.info("started the validateAndSaveMessage method of message service impl");
		try {
			logger.info("inside the validateAndSaveMessage method of message service impl ");
			if (Objects.nonNull(messageDto)) {

				logger.info("-------Saving message entity details into landing_table ---------" + messageDto);
				logger.info("calling the model mapper class");
				messageEntity = modelMapper.map(messageDto, MessageEntity.class);
				messageRepository.save(messageEntity);

			} else {
				throw new MessageEmptyException(" entered message is empty");
			}
			return messageEntity;
		} catch (Exception e) {
			logger.error("Exception in validateAndSaveMessage method of message service impl ", e);
			System.out.println(e);
		}
		logger.info("Ended: validateAndSaveMessage method of message service impl");
		return messageEntity;
	}

}
