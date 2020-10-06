package com.xworkz.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.springboot.dto.AppInfoDTO;
import com.xworkz.springboot.dto.EnvironmentDTO;
import com.xworkz.springboot.entity.AppInfoEntity;
import com.xworkz.springboot.entity.EnvironmentEntity;
import com.xworkz.springboot.entity.MessageEntity;
import com.xworkz.springboot.repository.AppInfoRepository;
import com.xworkz.springboot.repository.EnvironmentRepository;
import com.xworkz.springboot.repository.MessageRepository;

import org.springframework.stereotype.Service;

@Service("AppInfoService")
public class AppInfoServiceImpl implements AppInfoService {
	private static final Logger logger = Logger.getLogger(AppInfoServiceImpl.class);
	
	@Autowired
	private MessageRepository messageRepository;
	@Autowired
	private AppInfoRepository appInfoRepository ;
	@Autowired
	private EnvironmentRepository environmentRepository ;
	@Autowired
	private ModelMapper modelMapper;

	public AppInfoServiceImpl() {
		logger.info("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public String validateAndSave(AppInfoDTO appInfoDTO, List<EnvironmentDTO> EnvironmentList) {
		
		logger.info("Invoked validateAndSave"+this.getClass().getSimpleName());
		AppInfoEntity appInfoEntity1=new AppInfoEntity();
		MessageEntity messageEntity = new MessageEntity();
		List<EnvironmentEntity> envEntitySList=new ArrayList<>();
		String fromName=null;
		try {
			logger.info("Validation of app info dto started in"+this.getClass().getSimpleName());
			if(Objects.nonNull(appInfoDTO))
			{
				logger.info("appInfoDTO is not null");
				{
					ModelMapper modelMapper=new ModelMapper();
					modelMapper.map(appInfoDTO, appInfoEntity1);
					
					for(EnvironmentDTO env:EnvironmentList) {
						
						EnvironmentEntity envEntity=new EnvironmentEntity();
						modelMapper.map(env, envEntity);
						envEntity.setAppInfoEntity(appInfoEntity1);
						envEntitySList.add(envEntity);
					}
				
					appInfoEntity1.setEnvironmentEntity(envEntitySList);
					
					logger.info("FROM NAME is valid");
					logger.info("Entity is : "+appInfoEntity1);

					fromName=appInfoRepository.save(appInfoEntity1,envEntitySList);
				} 
			}
		}catch (Exception e) {
			logger.error("Error Occured in validateAndSave() in "+this.getClass().getSimpleName(),e);
		}
		return fromName;
		
	}
	

	
	

}
