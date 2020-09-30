package com.xworkz.springboot.service;

import java.util.Objects;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springboot.entity.SpringbootEntity;
import com.xworkz.springboot.repository.SpringbootRepository;


@Service
public class SpringbootServiceImpl implements SpringbootService {

	@Autowired
	SpringbootRepository springbootRepository;

	private static final Logger logger = Logger.getLogger(SpringbootServiceImpl.class);

	@Override
	public SpringbootEntity save(SpringbootEntity springbootEntity) {
		SpringbootEntity entity = null;
		try {
			logger.info("Started save from SpringbootServiceImpl ");
			if (Objects.nonNull(springbootEntity)) {

				logger.info("Saving entity into DB" + springbootEntity);
				springbootRepository.save(springbootEntity);

			}
			return entity;
		} catch (Exception e) {
			logger.error("Exception in save ", e);
			System.out.println(e);
		}
		logger.info("Ended save  from /WEB-INF/");
		return springbootEntity;
	}
}
