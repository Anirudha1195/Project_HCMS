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
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employees getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
