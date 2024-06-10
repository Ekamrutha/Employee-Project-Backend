package com.example.EmployeeDashboard.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDashboard.Model.Login;
import com.example.EmployeeDashboard.Repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository repository;

	public List<Login> getEmployeeLoginData() {
		List<Login> EmployeeLoginData = new ArrayList<Login>();
		repository.findAll().forEach(EmployeeLoginData::add);
		return EmployeeLoginData;
	}
}
