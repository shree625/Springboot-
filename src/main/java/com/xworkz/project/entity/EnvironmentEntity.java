package com.xworkz.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

import lombok.Data;

@Entity
@Table(name = "environment_details")
@Data
public class EnvironmentEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(EnvironmentEntity.class);

	@Column(name = "ENVIRONMENT_ID")
	private Integer id;
	@Column(name = "ENVIRONMENT")
	private String environment;
	@Column(name = "URL")
	private String url;
	@Column(name = "IS_ACCESSIBLE")
	private Boolean isAccessible;

	@ManyToOne
	@JoinColumn(name = "APP_ID", nullable = false)
	private AppInfoEntity appInfo;

	public EnvironmentEntity() {
		logger.info(this.getClass().getSimpleName() + " is created");
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public AppInfoEntity getAppInfo() {
		return appInfo;
	}


	public void setAppInfo(AppInfoEntity appInfo) {
		this.appInfo = appInfo;
	}


	@Override
	public String toString() {
		return "EnvironmentEntity [id=" + id + ", environment=" + environment + ", url=" + url + ", isAccessible="
				+ isAccessible + "]";
	}
}

