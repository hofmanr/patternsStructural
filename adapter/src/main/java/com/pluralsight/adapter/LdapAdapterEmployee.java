package com.pluralsight.adapter;

public class LdapAdapterEmployee extends EmployeeLdap {
    public LdapAdapterEmployee(Employee employee) {
        super(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
    }
}
