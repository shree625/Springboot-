package com.xworkz.springboot.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class EnvironmentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(EnvironmentDTO.class);

	private String envValue;
	private String url;

	public EnvironmentDTO() {
		logger.info("Created " + this.getClass().getSimpleName());
	}

	public EnvironmentDTO(String envValue, String url) {
		super();
		this.envValue = envValue;
		this.url = url;
	}

	public String getEnvValue() {
		return envValue;
	}

	public void setEnvValue(String envValue) {
		this.envValue = envValue;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "EnvironmentDTO [envValue=" + envValue + ", url=" + url + "]";
	}

}
