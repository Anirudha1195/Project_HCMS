package com.HCMS.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCMS.dao.EmployeesDAO;
import com.HCMS.entities.Employees;

import jakarta.transaction.Transactional;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	private EmployeesDAO employeesDAO;

	@Override
	public List<Employees> getAllEmployees() {
		return employeesDAO.getAllEmployees();
	}

	@Override
	public void addEmployee(Employees employee) {
		employeesDAO.addEmployee(employee);
	}

	@Override
	public void updateEmployee(Employees employee) {
	 employeesDAO.updateEmployee(employee);

	}

	@Override
	public void deleteEmployee(Employees employee) {
		employeesDAO.deleteEmployee( employee);

	}

	@Override
	public Employees getEmployeeById(int employeeId) {
		return employeesDAO.getEmployeeById(employeeId);
	}

}
