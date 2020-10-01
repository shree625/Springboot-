package com.xworkz.springboot.customexceptions;

public class MessageEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MessageEmptyException(String message) {
		super(message);
	}
}
