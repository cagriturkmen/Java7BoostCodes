package com.bilgeadam.week01.lesson005;

import java.util.Scanner;

public class ModAndivision {

	public static void main(String[] args) {
		
	//Kullanıcıdan 2 adet sayı girişi alın ve bu iki sayının modunu ve bölümünü hesaplayıp konsola yazdırın.
		
		double a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number : ");
		a= scan.nextDouble();
		System.out.println("Please enter second number : ");
		b = scan.nextDouble();
		
		double div = a/b;
		double mod = a%b;
		
		System.out.println(div);
		System.out.println(mod);
	}

}
