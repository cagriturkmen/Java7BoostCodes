package com.bilgeadam.week03.lesson005.hw;

public class Doctor extends Employee {

	public Doctor(String name, String lastname, double salary) {
		super(name, lastname, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double increaseSalary() {
		
		this.salary = salary*1.4;		
		
		return salary;
	}
	
}
