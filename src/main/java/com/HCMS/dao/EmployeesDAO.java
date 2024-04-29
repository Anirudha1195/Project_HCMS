package com.HCMS.dao;

import java.util.List;

import com.HCMS.entities.Employees;

public interface EmployeesDAO {

	List<Employees> getAllEmployees();

	void addEmployee(Employees employee);

	void updateEmployee(Employees employee);

	void deleteEmployee(Employees obj);

	Employees getEmployeeById(int employeeId);
}
