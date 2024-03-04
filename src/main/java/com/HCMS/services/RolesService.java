package com.HCMS.services;

import java.util.List;

import com.HCMS.entities.Roles;

public interface RolesService {

	List<Roles> getAllRoles();

	void addRole(Roles role);

	void updateRole(Roles role);

	void deleteRole(int roleId);

	Roles getRoleById(int roleId);

}
