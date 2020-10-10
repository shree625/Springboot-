package com.xworkz.project.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.EnvironmentDTO;
import com.xworkz.project.entity.EnvironmentEntity;

@Mapper(componentModel = "spring")
public interface EnvironmentMapper {

	public List<EnvironmentEntity> convertDTOToEntity(List<EnvironmentDTO> list);

}
