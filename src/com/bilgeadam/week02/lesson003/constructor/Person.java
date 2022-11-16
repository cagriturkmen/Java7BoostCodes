package com.bilgeadam.week02.lesson003.constructor;

public class Person {
	
	//Shift+alt+S
	//Generate constructor
	public String name;
	public int age;
	public String occupation;
	public double salary;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public Person(String name, int age, String occupation, double salary) {
		System.out.println("Bir person yarattın");
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", occupation=" + occupation + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
