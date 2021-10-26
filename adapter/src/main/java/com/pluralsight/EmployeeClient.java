package com.pluralsight;

import com.pluralsight.adapter.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		employees.add(employeeFromDB);
		
		//Will not work! This is where the adapter comes into play!
		
		//Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
		
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));

		// or we could do (is the same as Arrays.asList(arrayOfInts))
		employees.add(EmployeeAdapter.fromLdap(employeeFromLdap));

		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
		
	}

	public void putEmployee(Employee employee) {
		EmployeeLdap employeeFromLdap = new LdapAdapterEmployee(employee);
		System.out.println(employeeFromLdap.toString());
	}
	
}
