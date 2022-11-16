package com.bilgeadam.week02.lesson003.constructor;

public class Test {

	public static void main(String[] args) {
		
		//2parametreli contructorla oluşturduğum person
		Person person = new Person("Cagri",30);
		person.occupation="Student";
		System.out.println(person);

		//Parametresiz contructorla oluşturduğum person
		Person person3 = new Person();
		
		person3.age=20;
		person3.name="John";
		person3.occupation="Student";
		person3.salary=1000;
		System.out.println(person3);
		
		//Bütün parametreli contructorla oluşturduğum person
		Person person2 = new Person("Cagri",30,"Coder",1000);
		System.out.println(person2);
	}

}
