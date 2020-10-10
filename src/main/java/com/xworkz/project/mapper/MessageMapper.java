package com.xworkz.project.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.MessageDTO;
import com.xworkz.project.entity.MessageEntity;

@Mapper(componentModel = "spring")
public interface MessageMapper {

	public MessageEntity convertDTOToEntity(MessageDTO dto);
}