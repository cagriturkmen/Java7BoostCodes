package com.bilgeadam.week04.lesson001.hw.solid.dependencyinversion;

public class Test {

	public static void main(String[] args) {
		
		CreditCard creditCard= new CreditCard();
		DebitCard debitCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(debitCard);
		shoppingMall.doPayment(100);
		
	}

}
