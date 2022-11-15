package com.bilgeadam.week02.lesson002.hw;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		
		double weight,height,bmi;
		String gender;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz: ");
		weight= scanner.nextDouble();
		System.out.println("Boyunuzu giriniz : ");
		height = scanner.nextDouble();
		System.out.println("Cinsiyetinizi girin : ");
		gender= scanner.next();
		
		bmi = (weight*10000)/Math.pow(height, 2);
		
		if(gender.equals("K")) {
			if(bmi<19) {
				System.out.println("Zayıfsın");
			}else if(bmi<24) {
				System.out.println("Normalsin");
			}else if(bmi<30) {
				System.out.println("Kilolu");
			}else {
				System.out.println("Obez");
			}
		}else if(gender.equals("E")) {
			if(bmi<20) {
				System.out.println("Zayıfsın");
			}else if(bmi<25) {
				System.out.println("Normalsin");
			}else if(bmi<30) {
				System.out.println("Kilolu");
			}else {
				System.out.println("Obez");
			}
		}else
			System.out.println("Hatalı giriş");
		
		
	}

}
