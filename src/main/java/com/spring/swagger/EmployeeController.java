package com.spring.swagger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping()
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	@PostMapping("/")
	public Employee updateEmployees(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@PutMapping("/")
	public Employee createEmployees(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteEmployees(@PathVariable Long id) {
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeRepository.findById(id).get();
	}

}
