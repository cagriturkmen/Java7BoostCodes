package com.bilgeadam.week03.lesson005.hw;

public abstract class Employee implements Accountable {
	
	public String name;
	public String lastname;
	public double salary;

	
	public Employee(String name, String lastname, double salary) {
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname +" salary=" + salary + "]";
	}
	
	
	
}
