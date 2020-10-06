package com.xworkz.springboot.dto;

import org.apache.log4j.Logger;
import java.io.Serializable;

public class MessageDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(MessageDTO.class);

	private Integer id;
	private String fromName;
	private String message;

	public MessageDTO() {
		logger.info("create\t" + this.getClass().getSimpleName());
	}

	public MessageDTO(Integer id, String fromName, String message) {
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

	public MessageDTO(String fromName, String message) {
		super();
		this.fromName = fromName;
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageDTO [id=" + id + ", fromName=" + fromName + ", message=" + message + "]";
	}

}
