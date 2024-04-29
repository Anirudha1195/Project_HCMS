package com.HCMS.dao;


import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HCMS.entities.Roles;
import com.HCMS.entities.Roles;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RolesDAOImpl implements RolesDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Roles> getAllRoles() {
		return entityManager.unwrap(Session.class).createQuery("from Roles", Roles.class).getResultList();
	}

	@Override
	public void addRole(Roles Role) {
		entityManager.unwrap(Session.class).saveOrUpdate(Role);
	}

	@Override
	public void updateRole(Roles Role) {
		entityManager.unwrap(Session.class).merge(Role);

	}


	
	public void deleteRole(Roles emp) {
		entityManager.unwrap(Session.class).remove(emp);

	}

	@Override
	public Roles getRoleById(int RoleId) {
		return entityManager.unwrap(Session.class).get(Roles.class,RoleId);
	}

	@Override
	public void deleteRole(int roleId) {
		// TODO Auto-generated method stub
		
	}

}
