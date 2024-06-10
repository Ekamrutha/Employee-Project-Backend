package com.example.EmployeeDashboard.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDashboard.Model.EmployeeData;
import com.example.EmployeeDashboard.Repository.EmployeeDataRepository;

@Service
public class EmployeeDataService {

	@Autowired
	EmployeeDataRepository repo;
	
	public EmployeeData getData(String id){
		List<EmployeeData> DataOfEmployees = repo.findAll();
		EmployeeData emp = new EmployeeData();
		for(EmployeeData e : DataOfEmployees) {
			if(e.getEmployeeId().equals(id)) {
				emp = e;
			}
		}
		return emp;
	}
	
}
