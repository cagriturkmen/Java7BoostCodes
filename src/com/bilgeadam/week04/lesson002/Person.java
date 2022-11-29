package com.bilgeadam.week04.lesson002;

public class Person {
	
	String name;
	String lastname;
	String gender;
	int age;
	
	
	public Person(String name, String lastname, String gender, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}

	void speak() {
		System.out.println("Hi I am "+this.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
