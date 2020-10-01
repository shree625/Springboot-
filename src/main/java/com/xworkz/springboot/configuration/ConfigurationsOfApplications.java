package com.xworkz.springboot.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationsOfApplications {
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
