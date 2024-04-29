package com.HCMS.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCMS.dao.DepartmentsDAO;
import com.HCMS.dao.DepartmentsDAO;
import com.HCMS.entities.Departments;
import com.HCMS.entities.Departments;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

	@Autowired
	private DepartmentsDAO DepartmentsDAO;

	@Override
	public List<Departments> getAllDepartments() {
		return DepartmentsDAO.getAllDepartments();
	}

	@Override
	public void addDepartment(Departments Department) {
		DepartmentsDAO.addDepartment(Department);
	}

	@Override
	public void updateDepartment(Departments Department) {
	 DepartmentsDAO.updateDepartment(Department);

	}

	public void deleteDepartment(Departments Department) {
		DepartmentsDAO.deleteDepartment( Department);

	}

	@Override
	public Departments getDepartmentById(int DepartmentId) {
		return DepartmentsDAO.getDepartmentById(DepartmentId);
	}

	@Override
	public void deleteDepartment(int departmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployee(Departments employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departments getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
