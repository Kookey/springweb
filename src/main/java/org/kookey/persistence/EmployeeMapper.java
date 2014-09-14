package org.kookey.persistence;

import java.util.List;

import org.kookey.pojo.Employee;

public interface EmployeeMapper {

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(String id);

	public List<Employee> getAllEmployeeByName(String name);

	public void insertEmployee(Employee employee);

	public void updateEmployeeById(String id);
}