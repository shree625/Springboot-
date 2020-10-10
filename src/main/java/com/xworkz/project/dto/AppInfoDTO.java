package com.xworkz.project.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;

//import com.xworkz.project.entity.MessageEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class AppInfoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(AppInfoDTO.class);

	private Integer id;
	private String projectName;
	private String teamManagerName;
	private String teamContactEmail;
	private Boolean isDeCommissioned;
	private Date developedDate;
	private String version;
	private Date lastRelease;
	private Date nextRelease;

	ArrayList<EnvironmentDTO> environmentList;

	public AppInfoDTO() {
		logger.info(this.getClass().getSimpleName() + " is created");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTeamManagerName() {
		return teamManagerName;
	}

	public void setTeamManagerName(String teamManagerName) {
		this.teamManagerName = teamManagerName;
	}

	public String getTeamContactEmail() {
		return teamContactEmail;
	}

	public void setTeamContactEmail(String teamContactEmail) {
		this.teamContactEmail = teamContactEmail;
	}

	public Boolean getIsDeCommissioned() {
		return isDeCommissioned;
	}

	public void setIsDeCommissioned(Boolean isDeCommissioned) {
		this.isDeCommissioned = isDeCommissioned;
	}

	public Date getDevelopedDate() {
		return developedDate;
	}

	public void setDevelopedDate(Date developedDate) {
		this.developedDate = developedDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getLastRelease() {
		return lastRelease;
	}

	public void setLastRelease(Date lastRelease) {
		this.lastRelease = lastRelease;
	}

	public Date getNextRelease() {
		return nextRelease;
	}

	public void setNextRelease(Date nextRelease) {
		this.nextRelease = nextRelease;
	}

	public ArrayList<EnvironmentDTO> getEnvironmentList() {
		return environmentList;
	}

	public void setEnvironmentList(ArrayList<EnvironmentDTO> environmentList) {
		this.environmentList = environmentList;
	}

	@Override
	public String toString() {
		return "AppInfoDTO [id=" + id + ", projectName=" + projectName + ", teamManagerName=" + teamManagerName
				+ ", teamContactEmail=" + teamContactEmail + ", isDeCommissioned=" + isDeCommissioned
				+ ", developedDate=" + developedDate + ", version=" + version + ", lastRelease=" + lastRelease
				+ ", nextRelease=" + nextRelease + ", environmentList=" + environmentList + "]";
	}

	
}
