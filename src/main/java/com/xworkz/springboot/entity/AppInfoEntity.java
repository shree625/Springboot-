package com.xworkz.springboot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name = "App_Info")
public class AppInfoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(AppInfoEntity.class);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROJECT_ID")
	private Integer pId; // projectId
	@Column(name = "PROJECT_NAME")
	private String projectName;
	@Column(name = "TEAM_MANAGER_NAME")
	private String TeamManagerName;
	@Column(name = "CONTACT_EMAIL")
	private String email;
	@Column(name = "DE_COMISSIONED")
	private String deComissioned;
	@Column(name = "DEVELOPED_DATE")
	private String developedDate;
	@Column(name = "VERSION")
	private String version;
	@Column(name = "LAST_RELEASE")
	private String lastRelease;
	@Column(name = "NEXT_RELEASE")
	private String nextRelease;

	@OneToMany(mappedBy = "AppInfo")
	private List<EnvironmentEntity> environmentEntity;

	public AppInfoEntity() {
		logger.info("created\t" + this.getClass().getSimpleName());
	}

	public AppInfoEntity(Integer pId, String projectName, String teamManagerName, String email, String deComissioned,
			String developedDate, String version, String lastRelease, String nextRelease,
			List<EnvironmentEntity> environmentEntity) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		TeamManagerName = teamManagerName;
		this.email = email;
		this.deComissioned = deComissioned;
		this.developedDate = developedDate;
		this.version = version;
		this.lastRelease = lastRelease;
		this.nextRelease = nextRelease;
		this.environmentEntity = environmentEntity;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
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

	public String getDeComissioned() {
		return deComissioned;
	}

	public void setDeComissioned(String deComissioned) {
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

	public List<EnvironmentEntity> getEnvironmentEntity() {
		return environmentEntity;
	}

	public void setEnvironmentEntity(List<EnvironmentEntity> environmentEntity) {
		this.environmentEntity = environmentEntity;
	}

	@Override
	public String toString() {
		return "AppInfoEntity [pId=" + pId + ", projectName=" + projectName + ", TeamManagerName=" + TeamManagerName
				+ ", email=" + email + ", deComissioned=" + deComissioned + ", developedDate=" + developedDate
				+ ", version=" + version + ", lastRelease=" + lastRelease + ", nextRelease=" + nextRelease
				+ ", environmentEntity=" + environmentEntity + "]";
	}

}