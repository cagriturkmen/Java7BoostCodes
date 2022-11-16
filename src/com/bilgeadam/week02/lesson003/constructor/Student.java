package com.bilgeadam.week02.lesson003.constructor;
//Student is a Person
//Öğrenci bir insandır.
public class Student extends Person{	

	public int grade;

	public Student(String name, int age, int grade,String occupation,double salary) {
		super(name, age,occupation,salary);
		this.grade = grade;
	}
	

	
	
	
}
