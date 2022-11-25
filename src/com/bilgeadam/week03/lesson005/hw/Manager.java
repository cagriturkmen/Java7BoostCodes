package com.bilgeadam.week03.lesson005.hw;

public class Manager extends Employee {

	public Manager(String name, String lastname, double salary) {
		super(name, lastname, salary);

	}
	
	@Override
	public double increaseSalary() {
		salary = salary*1.3;		
		return salary;
	}
	
}
