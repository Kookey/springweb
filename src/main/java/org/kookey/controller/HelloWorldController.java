package org.kookey.controller;

import java.util.List;

import javax.annotation.Resource;

import org.kookey.exception.BusinessException;
import org.kookey.pojo.Employee;
import org.kookey.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Resource
	private EmployeeService employeeService;
	@RequestMapping("test/login.do")
	public String testLogin() throws Exception{
		throw new BusinessException("业务异常");
//		LOG.warn("测试springMVC");
//		return "login";
	}
	@RequestMapping(value="test/ajax.do",method=RequestMethod.POST)
	public String testAjax() throws Exception{
		throw new BusinessException("ajax 请求");
	}
	@RequestMapping(value="test/json.do",method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeJson(Model model){
		return employeeService.getAllEmployee();
	}
}
