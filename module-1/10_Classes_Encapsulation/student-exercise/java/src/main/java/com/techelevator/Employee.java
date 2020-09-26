package com.techelevator;

public class Employee {
	private int employeeID;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;
	
	//constructor
	public Employee(int employeeID, String firstName, String lastName, double salary) {
		this.employeeID=employeeID;
		this.annualSalary=salary;
		this.firstName=firstName;
		this.lastName=lastName;
		this.fullName=lastName+", "+firstName;
	}
	
	//getters and setters
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmployeeId() {
		return this.employeeID;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getFullName() {
		return this.fullName;
	}

	public double getAnnualSalary() {
		return this.annualSalary;
	}

	//method
	public void raiseSalary(double percent) {
		double increaseAmount=this.annualSalary*percent*.01;
		this.annualSalary+=increaseAmount;
	}
}
	
	


