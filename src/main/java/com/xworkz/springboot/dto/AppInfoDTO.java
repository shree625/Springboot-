package com.xworkz.springboot.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class AppInfoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(AppInfoDTO.class);

	private String projectName;
	private String TeamManagerName;
	private String email;
	private Boolean deComissioned;
	private String developedDate;
	private String version;
	private String lastRelease;
	private String nextRelease;

	public AppInfoDTO() {
		logger.info("create\t" + this.getClass().getSimpleName());
	}

	public AppInfoDTO(String projectName, String teamManagerName, String email, Boolean deComissioned,
			String developedDate, String version, String lastRelease, String nextRelease) {
		super();
		this.projectName = projectName;
		TeamManagerName = teamManagerName;
		this.email = email;
		this.deComissioned = deComissioned;
		this.developedDate = developedDate;
		this.version = version;
		this.lastRelease = lastRelease;
		this.nextRelease = nextRelease;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTeamManagerName() {
		return TeamManagerName;
	}

	public void setTeamManagerName(String teamManagerName) {
		TeamManagerName = teamManagerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getDeComissioned() {
		return deComissioned;
	}

	public void setDeComissioned(Boolean deComissioned) {
		this.deComissioned = deComissioned;
	}

	public String getDevelopedDate() {
		return developedDate;
	}

	public void setDevelopedDate(String developedDate) {
		this.developedDate = developedDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLastRelease() {
		return lastRelease;
	}

	public void setLastRelease(String lastRelease) {
		this.lastRelease = lastRelease;
	}

	public String getNextRelease() {
		return nextRelease;
	}

	public void setNextRelease(String nextRelease) {
		this.nextRelease = nextRelease;
	}

	@Override
	public String toString() {
		return "AppInfoDTO [projectName=" + projectName + ", TeamManagerName=" + TeamManagerName + ", email=" + email
				+ ", deComissioned=" + deComissioned + ", developedDate=" + developedDate + ", version=" + version
				+ ", lastRelease=" + lastRelease + ", nextRelease=" + nextRelease + "]";
	}

}
