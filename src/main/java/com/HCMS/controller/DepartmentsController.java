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

import com.HCMS.entities.Departments;
import com.HCMS.entities.Departments;
import com.HCMS.services.DepartmentsService;
@CrossOrigin("*")
@RestController
public class DepartmentsController {
	
	@Autowired
	private DepartmentsService DepartmentsService;

	@GetMapping("/Departments")
	private ResponseEntity<List<Departments>> getAll() {
		return new ResponseEntity<List<Departments>>(DepartmentsService.getAllDepartments(), HttpStatus.OK);
	}
	@PostMapping("/Departments")
	private ResponseEntity<Void> save(@RequestBody Departments department, UriComponentsBuilder ucBuilder) {
		if (department == null) {
			throw new RuntimeException("department Object can't  be NULL");
		}
	DepartmentsService.addDepartment(department);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("Departments/{id}").buildAndExpand(department).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@GetMapping("/Departments/{id}")
	private ResponseEntity<Departments> get(@PathVariable int id) {
		Departments dpt = DepartmentsService.getDepartmentById(id);
		if (dpt == null) {
			return new ResponseEntity<Departments>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Departments>(dpt, HttpStatus.OK);
		}
	}
	@PutMapping("/Departments/{id}")
	private ResponseEntity<Void> update(@RequestBody Departments toBeUpdatedpt, @PathVariable int id) {
		if (toBeUpdatedpt == null) {
			throw new RuntimeException("Department Object can't  be NULL");
		}
		Departments existingdpt = DepartmentsService.getDepartmentById(id);
		if (toBeUpdatedpt == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
		DepartmentsService.addDepartment(toBeUpdatedpt);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}


	@DeleteMapping("/Departments/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Departments deletedepartment = DepartmentsService.getDepartmentById(id);
		if (deletedepartment == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
		DepartmentsService.deleteDepartment(id);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}


}
