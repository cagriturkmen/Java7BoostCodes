package com.bilgeadam.week03.lesson001.listexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		
		String[] product = {"Chips", "Coke", "Sugar", "Olive", "Milk", "Bread", "Tea", "Egg", "Yoghurt", "Cheese"};
		
		List<String> myCard = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean condition=true;
		while(condition) {
			displayMenu();
			int input = scanner.nextInt();
			
			switch (input) {
			case 1:			
				printProduct(product);
				break;
			case 2:
				addProduct(product,myCard);
				break;
			case 3:
				printMyCard(myCard);
				break;
			case 0:
				condition=false;
			default:
				break;
			}
			
		}
		System.out.println("See you later");
	}
	
	private static void printMyCard(List<String> myCard) {
		System.out.println("========================");
		System.out.println("Products in Cart");
		System.out.println("-------------------------------");
		for (String product : myCard) {
			System.out.println(product);
		}
	}

	private static void addProduct(String[] product, List<String> myCard) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter product number");
		int input = scanner.nextInt();
		myCard.add(product[input-1]);
		System.out.println(product[input-1]+" product added to your cart.");
	}

	private static void printProduct(String[] product) {
		
		for (int i = 0; i < product.length; i++) {
			System.out.println(i+1 + " - "+ product[i]);
		}
		
	}

	private static void displayMenu() {
		System.out.println("Please choose what you wann do");
		System.out.println("-------------------------------");
		System.out.println("1- Show Products");
		System.out.println("2-Add product to Cart");
		System.out.println("3-Show Cart");
		System.out.println("4-Exit");
		System.out.println("------------------------------");
	}

}
