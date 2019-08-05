package com.dbs.empMgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dbs.empMgmt.model.Employee;


public interface EmployeeService {
	
	  Employee saveEmployee(Employee employee);

	   List<Employee> listAll();

	   Employee findById(long empId);

	   void deleteEmployee(long empId);

}
