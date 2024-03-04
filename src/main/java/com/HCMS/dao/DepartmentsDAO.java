package com.HCMS.dao;


import java.util.List;

import com.HCMS.entities.Departments;

public interface DepartmentsDAO {
	List<Departments> getAllDepartments();

	void addDepartments(Departments department);
}

