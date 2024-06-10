package com.example.EmployeeDashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeDashboard.Model.EmployeeData;

public interface EmployeeDataRepository extends JpaRepository<EmployeeData, String> {

}
