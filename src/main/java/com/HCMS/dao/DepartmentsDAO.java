package com.HCMS.dao;


import java.util.List;

import com.HCMS.entities.Departments;
import com.HCMS.entities.Departments;

public interface DepartmentsDAO {
	List<Departments> getAllDepartments();

	void addDepartment(Departments Department);

	void updateDepartment(Departments Department);

	void deleteDepartment(Departments obj);

	Departments getDepartmentById(int DepartmentId);
}

