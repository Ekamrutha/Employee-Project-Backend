package com.example.EmployeeDashboard.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDashboard.Model.EmployeeData;
import com.example.EmployeeDashboard.Repository.EmployeeDataRepository;

@Service
public class EmployeeDataService {

	@Autowired
	EmployeeDataRepository repo;
	
	public void getData( String id){
		ArrayList<EmployeeData> data = new ArrayList<EmployeeData>();
	}
	
}
