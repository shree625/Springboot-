package com.xworkz.project.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;

//import org.hibernate.annotations.GenericGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "message_details")
public class MessageEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(MessageEntity.class);
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "FROM_USER")
	private String from;
	@Column(name = "MESSAGE")
	private String message;

	public MessageEntity() {
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
		return "MessageEntity [id=" + id + ", from=" + from + ", message=" + message + "]";
	}
	

}