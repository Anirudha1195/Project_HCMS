package com.HCMS.services;


import java.util.List;

import com.HCMS.entities.Departments;

public interface DepartmentsService {

	List<Departments> getAllDepartments();

	void addDepartment(Departments department);

	void updateDepartment(Departments department);

	void deleteDepartment(int departmentId);

	Departments getDepartmentById(int departmentId);

	void addEmployee(Departments employee);

	Departments getEmployeeById(int id);

	void deleteDepartment(Departments Department);

}

