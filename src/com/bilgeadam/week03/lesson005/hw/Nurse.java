package com.bilgeadam.week03.lesson005.hw;

public class Nurse extends Employee {

	public Nurse(String name, String lastname, double salary) {
		super(name, lastname, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double increaseSalary() {
		
		salary = salary*1.2;		
		return salary;
	}
	
}
