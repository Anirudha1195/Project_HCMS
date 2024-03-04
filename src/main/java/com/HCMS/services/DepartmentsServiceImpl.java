package com.HCMS.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCMS.dao.DepartmentsDAO;
import com.HCMS.entities.Departments;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

	@Autowired
	private DepartmentsDAO departmentsDAO;

	@Override
	public List<Departments> getAllDepartments() {
		return departmentsDAO.getAllDepartments();
	}

	@Override
	public void addDepartment(Departments role) {
		departmentsDAO.addDepartments(role);
	}

	@Override
	public void updateDepartment(Departments department) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDepartment(int departmentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Departments getDepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
