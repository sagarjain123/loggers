package com.om.sai.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(value="/")
public class Controller {
	
	Logger logger = LoggerFactory.getLogger(Controller.class);
	
	public Controller() {
		logger.info("Created \t " +this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/test.do")
	public String getHome() {
		logger.info("Inside controller getHome ");
		return "home.jsp";
	}

}
