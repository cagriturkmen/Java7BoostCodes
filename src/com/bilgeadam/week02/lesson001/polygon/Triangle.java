package com.bilgeadam.week02.lesson001.polygon;

public class Triangle implements Polygon,Side{

	@Override
	public void getArea(double length) {
		//a^2*kök3/4
		double area;
		area=Math.pow(length,2)*((Math.sqrt(3))/4);
		System.out.println(area);
	}

	@Override
	public void getSides() {
		
		System.out.println("I have 3 sides");
		
	}

}
