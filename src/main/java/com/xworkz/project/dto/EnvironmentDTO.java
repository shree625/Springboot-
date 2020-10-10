package com.xworkz.project.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class EnvironmentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(EnvironmentDTO.class);
	private String environment;
	private String url;
	private Boolean isAccessible;

	public EnvironmentDTO() {
		logger.info(this.getClass().getSimpleName() + " is created");
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsAccessible() {
		return isAccessible;
	}

	public void setIsAccessible(Boolean isAccessible) {
		this.isAccessible = isAccessible;
	}

	@Override
	public String toString() {
		return "EnvironmentDTO [environment=" + environment + ", url=" + url + ", isAccessible=" + isAccessible + "]";
	}

}
