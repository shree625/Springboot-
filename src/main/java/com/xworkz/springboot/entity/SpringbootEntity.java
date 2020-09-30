package com.xworkz.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="landing")
@Data
public class SpringbootEntity implements Serializable {
			
		
	private static final long serialVersionUID = 1L;
			@Id
			@GenericGenerator(name = "xworkz", strategy = "increment")
			@GeneratedValue(generator="xworkz")
			@Column(name="id")
			private int id;
			@Column(name="from_name")
			private String fromName;
			@Column(name="message")
			private String message;
			
			
}
