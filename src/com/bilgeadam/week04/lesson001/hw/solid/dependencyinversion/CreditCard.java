package com.bilgeadam.week04.lesson001.hw.solid.dependencyinversion;

public class CreditCard implements PaymentMethod,LoanOperations{

	public void doTransaction(int amount) {
		
		System.out.println("tx done with CreditCard"+ amount);
		
	}

	@Override
	public void getLoan() {
		// TODO Auto-generated method stub
		
	}
	
}
