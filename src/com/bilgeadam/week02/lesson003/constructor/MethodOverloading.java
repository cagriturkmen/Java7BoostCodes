package com.bilgeadam.week02.lesson003.constructor;

public class MethodOverloading {
	
	public static void display(int a) {		
		System.out.println("I have a integer data :" + a);	
	}
	
	public static void display(String name) {		
		System.out.println("I have a string data: " + name);	
	}	
	
	public static void display(String name, int age) {		
		System.out.println(name + "'nın yasi "+age+"dir." );
	}	
	
	public static void main(String[] args) {
		display(3);
		display("Cagri");
		display("Cagri",3);
	}
	
}
