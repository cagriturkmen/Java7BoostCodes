package com.bilgeadam.week02.lesson003.composition;

public class Test {

	public static void main(String[] args) {
		
		Engine engine = new Engine("Diesel",300);
		
		Car car = new Car("BMW", engine);
		
		System.out.println(car);
		
	}

}
