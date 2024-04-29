package com.HCMS.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HCMS.dao.DepartmentsDAO;
import com.HCMS.entities.Departments;
import com.HCMS.entities.Departments;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class DepartmentsDAOImpl implements DepartmentsDAO {


	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Departments> getAllDepartments() {
		return entityManager.unwrap(Session.class).createQuery("from Departments", Departments.class).getResultList();
	}

	@Override
	public void addDepartment(Departments Department) {
		entityManager.unwrap(Session.class).saveOrUpdate(Department);
	}

	@Override
	public void updateDepartment(Departments Department) {
		entityManager.unwrap(Session.class).merge(Department);

	}


	@Override
	public void deleteDepartment(Departments emp) {
		entityManager.unwrap(Session.class).remove(emp);

	}

	@Override
	public Departments getDepartmentById(int DepartmentId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Departments.class,DepartmentId);
	}

}
