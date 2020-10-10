package com.xworkz.project.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "App-Info")
public class AppInfoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(AppInfoEntity.class);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "PROJECT_NAME")
	private String projectName;
	@Column(name = "TEAM_MANAGER_NAME")
	private String teamManagerName;
	@Column(name = "TEAM_CONTACT_EMAIL")
	private String teamContactEmail;
	@Column(name = "IS_DECOMMISSIONED")
	private Boolean isDeCommissioned;
	@Column(name = "DEVELOPED_DATE")
	private Date developedDate;
	@Column(name = "PROJECT_VERSION")
	private String version;
	@Column(name = "LAST_RELEASE")
	private Date lastRelease;
	@Column(name = "NEXT_RELEASE")
	private Date nextRelease;

	@OneToMany(mappedBy = "appInfo", cascade = CascadeType.ALL)
	private List<EnvironmentEntity> environmentList;

	public AppInfoEntity() {
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



	public List<EnvironmentEntity> getEnvironmentList() {
		return environmentList;
	}



	public void setEnvironmentList(List<EnvironmentEntity> environmentList) {
		this.environmentList = environmentList;
	}



	@Override
	public String toString() {
		return "AppInfoEntity [id=" + id + ", projectName=" + projectName + ", teamManagerName=" + teamManagerName
				+ ", teamContactEmail=" + teamContactEmail + ", isDeCommissioned=" + isDeCommissioned
				+ ", developedDate=" + developedDate + ", version=" + version + ", lastRelease=" + lastRelease
				+ ", nextRelease=" + nextRelease + "]";
	}
}
