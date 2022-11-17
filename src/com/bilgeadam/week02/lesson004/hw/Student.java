package com.bilgeadam.week02.lesson004.hw;

public class Student extends Person {
	
	public Course course;

	public Student(long id, String name,Course course) {
		super(id, name);
		this.course=course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	



	

}
