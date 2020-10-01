package com.xworkz.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name = "landing")
public class MessageEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(MessageEntity.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "from_name")
	private String fromName;
	@Column(name = "message")
	private String message;

	public MessageEntity() {
		logger.info("created\t" + this.getClass().getSimpleName());
	}

	public MessageEntity(Integer id, String fromName, String message) {
		super();
		this.id = id;
		this.fromName = fromName;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageEntity [id=" + id + ", fromName=" + fromName + ", message=" + message + "]";
	}

	public MessageEntity(String fromName, String message) {
		super();
		this.fromName = fromName;
		this.message = message;
	}

}
