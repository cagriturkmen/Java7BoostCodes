package com.bilgeadam.week04.lesson001.hw.solid.dependencyinversion;

public class DebitCard implements PaymentMethod {

	public void doTransaction(int amount) {
		
		System.out.println("tx done with DebitCard"+ amount);
		
	}
	
}
