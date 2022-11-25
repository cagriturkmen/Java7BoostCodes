package com.bilgeadam.week03.lesson005.hw;

public class Manager extends Employee {

	public Manager(String name, String lastname, Jobs job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void increaseSalary(double salary) {
		
		salary = salary*1.3;		
		
	}
	
}
