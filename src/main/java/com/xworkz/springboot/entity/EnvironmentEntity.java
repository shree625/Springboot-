package com.xworkz.springboot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name = "save_environment")
public class EnvironmentEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(EnvironmentEntity.class);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ENV_ID")
	private Integer envId;
	@Column(name = "ENV_TYPE")
	private String envValue;
	@Column(name = "ENV_URL")
	private String url;

	@ManyToOne
	@JoinColumn(name = "pId")
	private AppInfoEntity appInfoEntity;

	public EnvironmentEntity() {
		logger.info("Created " + this.getClass().getSimpleName());
	}

	public EnvironmentEntity(Integer envId, String envValue, String url, AppInfoEntity appInfoEntity) {
		super();
		this.envId = envId;
		this.envValue = envValue;
		this.url = url;
		this.appInfoEntity = appInfoEntity;
	}

	public Integer getEnvId() {
		return envId;
	}

	public void setEnvId(Integer envId) {
		this.envId = envId;
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

	public AppInfoEntity getAppInfoEntity() {
		return appInfoEntity;
	}

	public void setAppInfoEntity(AppInfoEntity appInfoEntity) {
		this.appInfoEntity = appInfoEntity;
	}

	@Override
	public String toString() {
		return "EnvironmentEntity [envId=" + envId + ", envValue=" + envValue + ", url=" + url + ", appInfoEntity="
				+ appInfoEntity + "]";
	}

}
