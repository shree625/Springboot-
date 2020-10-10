package com.xworkz.project.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MessageDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(MessageDTO.class);
	private Integer id;
	private String from;
	private String message;

	public MessageDTO() {
		logger.info(this.getClass().getSimpleName() + " is created");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageDTO [id=" + id + ", from=" + from + ", message=" + message + "]";
	}

	
}
