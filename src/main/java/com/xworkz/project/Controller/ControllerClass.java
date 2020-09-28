package com.xworkz.project.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerClass {

	//private static final Logger logger = Logger.getLogger(ControllerClass.class);

	public ControllerClass() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@RequestMapping("onsend")
	public String onSend() {
		System.out.println("Invoked onSend");
		return "ViewPage.jsp";
	}

	@RequestMapping("onlanding")
	public String viewMessage(String from, String message, Model model) {
		System.out.println("Start of viewMessage method of ontroller class");
		try {
			System.out.println("Invoked view page and taking to greet page");

			model.addAttribute("from", from);
			model.addAttribute("message", message);
		} catch (Exception e) {
			System.err.println("Exception occurred in ControllerClass of viewMessage" + e.getMessage());
		}
		return "GreetMessage.jsp";
	}

}