package com.bilgeadam.week01.lesson005;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		double x,y,z,a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first angle : ");
		x = scanner.nextDouble();
		System.out.println("Enter line length for first angle : ");
		a = scanner.nextDouble();
		System.out.println("Enter second angle : ");
		y = scanner.nextDouble();
		System.out.println("Enter line length for second angle : ");
		b = scanner.nextDouble();
		//c^2=a^2 + b^2 - 2abcos(C)
		
		z= 180-(x+y);
		double zRad = Math.toRadians(z);
		
		double temp = Math.pow(a, 2) + (b*b) - (2*a*b*(Math.cos(zRad)));
		
		c = Math.sqrt(temp);
		
		System.out.println("Third angle is : " +z);
		System.out.println("Third line length is : "+ c );
		
	}

}
