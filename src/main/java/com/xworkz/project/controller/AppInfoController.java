package com.xworkz.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.project.dto.AppInfoDTO;
import com.xworkz.project.service.AppInfoService;

@Controller
@RequestMapping("/")
public class AppInfoController {

	private static final Logger logger = Logger.getLogger(AppInfoController.class);

	@Autowired
	private AppInfoService iAppInfoService;

	public AppInfoController() {
		logger.info(this.getClass().getSimpleName() + " is created");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping("getAppInfo")
	public String getInfo() {
		logger.info("invoking getInfo() of " + this.getClass().getSimpleName());
		return "appInfo";

	}

	@RequestMapping("saveAppInfo")
	public String saveAppInfo(Model model, AppInfoDTO appInfoDTO) {
		logger.info(" invoking saveAppInfo() of AppInfo controller");
		logger.info("Environment ::> {} " + appInfoDTO);
		try {
			appInfoDTO = iAppInfoService.validateAndSaveAppInfoDetails(appInfoDTO);
			if (appInfoDTO.getId() != null) {
				model.addAttribute("msg", "Application info saved successfully.");
			} else {
				model.addAttribute("msg", "Application info is not getting saved.");
			}
			return "App-Info";

		} catch (Exception e) {
			logger.error("Error occured in saveAppInfo of controller class" + e.getMessage());
		}

		return "Welcome";
	}
}
