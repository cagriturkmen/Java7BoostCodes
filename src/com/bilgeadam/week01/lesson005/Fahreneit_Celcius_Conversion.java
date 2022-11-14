package com.bilgeadam.week01.lesson005;

import java.util.Scanner;

public class Fahreneit_Celcius_Conversion {

	public static void main(String[] args) {
		//Fahreneit değeri okuyup celciusa çeviren program yazınız.
		//(f - 32) / 1.8;
		
		double f;
		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a fahreneit value: ");
		f= scan.nextFloat();
		
		c = ((f-32)/1.8);
		System.out.printf("%.2f", c);		
	}

}
