package com.bilgeadam.week02.lesson001.polygon;

public class Rectangle implements Polygon,Side {

	@Override
	public void getArea(double length) {
		double area;
		area = length*length;
		System.out.println(area);
	}

	@Override
	public void getSides() {
		
		System.out.println("I have 4 sides");
		
	}

}
