package com.example.EmployeeDashboard.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDashboard.Model.EmployeeData;
import com.example.EmployeeDashboard.Service.EmployeeDataService;

@RestController
public class EmployeeDataController {
	@Autowired
	EmployeeDataService service;

	@CrossOrigin(origins = "*")
	@PostMapping("/employeeData")
	public EmployeeData getData(@RequestBody String id) {
		return service.getData(id);
	}

}
