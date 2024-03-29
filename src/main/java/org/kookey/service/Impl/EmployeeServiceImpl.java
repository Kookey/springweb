package org.kookey.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.kookey.persistence.EmployeeMapper;
import org.kookey.pojo.Employee;
import org.kookey.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeMapper employeeMapper;
	
	@Override
	@Transactional
	public List<Employee> getAllEmployee(){
		return employeeMapper.getAllEmployee();
	}
}
