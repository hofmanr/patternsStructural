package com.pluralsight;

import com.pluralsight.adapter.Employee;
import com.pluralsight.adapter.EmployeeAdapter;
import com.pluralsight.adapter.EmployeeDB;
import com.pluralsight.adapter.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		employees.add(employeeFromDB);
		

		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

		Employee employee = EmployeeAdapter.INSTANCE.toEmployee(employeeFromLdap);
		employees.add(employee);

		return employees;
		
	}

	public void putEmployee(Employee employee) {
		EmployeeLdap employeeFromLdap = EmployeeAdapter.INSTANCE.toEmployeeLdap(employee);
		System.out.println(employeeFromLdap.toString());
	}

}
