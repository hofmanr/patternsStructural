package com.pluralsight;

import com.pluralsight.adapter.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);

        client.putEmployee(employees.get(1));
    }
}
