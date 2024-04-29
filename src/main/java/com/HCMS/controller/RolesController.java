package com.HCMS.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.HCMS.entities.Roles;
import com.HCMS.entities.Roles;
import com.HCMS.services.RolesService;
@CrossOrigin("*")
@RestController
public class RolesController {

	@Autowired
	private RolesService RolesService;

	@GetMapping("/Roles")
	private ResponseEntity<List<Roles>> getAll() {
		return new ResponseEntity<List<Roles>>(RolesService.getAllRoles(), HttpStatus.OK);
	}

	@PostMapping("/Roles")
	private ResponseEntity<Void> save(@RequestBody Roles Role, UriComponentsBuilder ucBuilder) {
		if (Role == null) {
			throw new RuntimeException("Role Object can't  be NULL");
		}
		RolesService.addRole(Role);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("Roles/{id}").buildAndExpand(Role).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@GetMapping("/Roles/{id}")
	private ResponseEntity<Roles> get(@PathVariable int id) {
		Roles rl = RolesService.getRoleById(id);
		if (rl == null) {
			return new ResponseEntity<Roles>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Roles>(rl, HttpStatus.OK);
		}
	}
	@PutMapping("/Roles/{id}")
	private ResponseEntity<Void> update(@RequestBody Roles toBeUpdaterl, @PathVariable int id) {
		if (toBeUpdaterl == null) {
			throw new RuntimeException("Role Object can't  be NULL");
		}
		Roles existingrl = RolesService.getRoleById(id);
		if (toBeUpdaterl == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			RolesService.updateRole(toBeUpdaterl);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}


	@DeleteMapping("/Roles/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Roles deleteRole = RolesService.getRoleById(id);
		if (deleteRole == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			RolesService.deleteRole(id);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	
	

















}
