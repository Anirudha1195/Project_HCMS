package com.HCMS.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCMS.dao.RolesDAO;
import com.HCMS.entities.Roles;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesDAO rolesDAO;

	@Override
	public List<Roles> getAllRoles() {
		return rolesDAO.getAllRoles();
	}

	@Override
	public void addRole(Roles role) {
		rolesDAO.addRole(role);
	}

	@Override
	public void updateRole(Roles role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRole(int roleId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Roles getRoleById(int roleId) {
		return rolesDAO.getRoleById(roleId);
	}

}
