package com.xworkz.springboot.service;

import java.util.List;

import com.xworkz.springboot.dto.AppInfoDTO;
import com.xworkz.springboot.dto.EnvironmentDTO;

public interface AppInfoService {
	public String validateAndSave(AppInfoDTO appInfoDTO, List<EnvironmentDTO> EnvironmentList);

}
