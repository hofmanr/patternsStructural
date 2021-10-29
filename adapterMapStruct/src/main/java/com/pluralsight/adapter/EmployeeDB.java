package com.pluralsight.adapter;

public class EmployeeDB extends Employee {

	public EmployeeDB(String id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String toString() {
		return "ID: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", Email: " + email;
	}

}
