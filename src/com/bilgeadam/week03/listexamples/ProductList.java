package com.bilgeadam.week03.listexamples;

import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int input=0;
		while(input!=3) {
		System.out.println("Choose");
		input = scan.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("Merhaba");
			break;
		case 2:
			System.out.println("Gule gule");
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Yanlis giris");
			break;
		}
		}
	}

}
