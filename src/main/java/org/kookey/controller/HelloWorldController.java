package org.kookey.controller;

import org.kookey.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);
	@RequestMapping("test/login.do")
	public String testLogin() throws Exception{
		throw new BusinessException("业务异常");
//		LOG.warn("测试springMVC");
//		return "login";
	}
}
