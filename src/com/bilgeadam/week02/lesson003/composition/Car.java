package com.bilgeadam.week02.lesson003.composition;
//Car has a Engine --> composition
//Araba bir motora sahiptir.
//aggregation

//composition aslında aggregation'un daha katı bir halidir.
public class Car {
	
	public String name;
	public final Engine engine;
	

	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
	
	
	
}
