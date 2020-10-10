package com.xworkz.project.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.AppInfoDTO;
import com.xworkz.project.entity.AppInfoEntity;


@Mapper(componentModel = "spring")
public interface AppInfoMapper {
	public AppInfoEntity convertDTOToEntity(AppInfoDTO dto);
}
