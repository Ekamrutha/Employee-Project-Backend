package com.example.EmployeeDashboard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDashboard.Model.Login;
import com.example.EmployeeDashboard.Service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService service;
	
	@GetMapping("/")
	public  List<Login> getData(){
		return service.getEmployeeLoginData();
	}
}
