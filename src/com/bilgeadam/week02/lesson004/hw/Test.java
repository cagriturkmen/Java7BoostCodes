package com.bilgeadam.week02.lesson004.hw;

public class Test {

	public static void main(String[] args) {
		
		Course math = new Course("Mat101", "Fundamentals of Algebra");
		Course java = new Course("JavaSE","Fundamentals of Java");
		
		Address address1 = new Address("Istanbul","Sisli");
		
		Student student1 = new Student(1L,"Cagri",java);
		student1.address=address1;
		System.out.println(student1);	
		
		
	}

}
