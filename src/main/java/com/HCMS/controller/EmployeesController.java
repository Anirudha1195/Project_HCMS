package com.HCMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HCMS.entities.Employees;
import com.HCMS.services.EmployeesService;
@RestController
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;

	@GetMapping("/employees")
	private ResponseEntity<List<Employees>> getAll() {
		return new ResponseEntity<List<Employees>>(employeesService.getAllEmployees(), HttpStatus.OK);
	}
}
