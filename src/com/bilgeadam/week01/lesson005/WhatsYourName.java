package com.bilgeadam.week01.lesson005;

import java.util.Scanner;

public class WhatsYourName {

	public static void main(String[] args) {

		//Kullanıcıya ismini sor,
		//Çıktı olarak kullanıcının ismiyle birlikte merhaba yazdır.
		String name;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		
		name = scan.nextLine();
		
		System.out.println("Hello "+name);
	}

}
