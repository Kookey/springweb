package org.kookey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping("test/login.do")
	public String testLogin(){
		LOG.warn("测试springMVC");
		return "login";
	}
}
