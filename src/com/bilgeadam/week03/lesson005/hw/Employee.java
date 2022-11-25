package com.bilgeadam.week03.lesson005.hw;

public abstract class Employee implements Accountable {
	
	public String name;
	public String lastname;
	public Jobs job;
	public double salary;
	

	public Employee(String name, String lastname, Jobs job, double salary) {
		this.name = name;
		this.lastname = lastname;
		this.job = job;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
	
}
