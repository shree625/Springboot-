package com.xworkz.project.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.AppInfoDTO;
import com.xworkz.project.entity.AppInfoEntity;
import com.xworkz.project.entity.EnvironmentEntity;
import com.xworkz.project.mapper.AppInfoMapper;
import com.xworkz.project.mapper.EnvironmentMapper;
import com.xworkz.project.repository.AppInfoRepository;

@Service
public class AppInfoServiceImpl implements AppInfoService {
	private static final Logger logger = Logger.getLogger(AppInfoServiceImpl.class);

	@Autowired
	private AppInfoRepository appInfoRepository;

	@Autowired
	private AppInfoMapper iAppInfoMapper;
	@Autowired
	private EnvironmentMapper iEnvironmentMapper;

	public AppInfoServiceImpl() {
		logger.info(this.getClass().getSimpleName() + " is created");
	}

	@Override
	public AppInfoDTO validateAndSaveAppInfoDetails(AppInfoDTO appInfoDTO) {

		logger.info("invoking validateAndSaveAppInfoDetails()" + this.getClass().getSimpleName());
		try {
			AppInfoEntity appInfoEntity = iAppInfoMapper.convertDTOToEntity(appInfoDTO);

			List<EnvironmentEntity> environmentList = iEnvironmentMapper
					.convertDTOToEntity(appInfoDTO.getEnvironmentList());

			for (int i = 0; i < environmentList.size(); i++) {
				environmentList.get(i).setAppInfo(appInfoEntity);
			}
			appInfoEntity.setEnvironmentList(environmentList);

			appInfoEntity = appInfoRepository.save(appInfoEntity);
			logger.error("Error :::::>>>>> {}"+ appInfoEntity.getEnvironmentList());
			if (appInfoEntity.getId() != null) {
				appInfoDTO.setId(appInfoEntity.getId());
			}
		} catch (Exception e) {
			logger.error("error occurred in convertAndSaveMessageDetails of app-info service impl" + e.getMessage());
		}
		return appInfoDTO;
	}

}