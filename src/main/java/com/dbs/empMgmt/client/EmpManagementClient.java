package com.dbs.empMgmt.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.empMgmt.controller.EmployeeController;
import com.dbs.empMgmt.model.Employee;

public class EmpManagementClient {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeController employeeController = context.getBean(EmployeeController.class);
        Employee employee1 = new Employee(12,"Harish", LocalDate.of(1985,5, 25));
        Employee employee2 = new Employee(13,"Rakesh", LocalDate.of(1965,3, 24));
        Employee employee3 = new Employee(14,"Mahesg", LocalDate.of(1975,2, 21));

        employeeController.saveEmployee(employee1);
        employeeController.saveEmployee(employee2);
        employeeController.saveEmployee(employee3);
       // employeeController.deleteEmployee(12);
        employeeController.listAll().forEach(System.out::println);
        employeeController.deleteEmployee(12);
		
	}

}
