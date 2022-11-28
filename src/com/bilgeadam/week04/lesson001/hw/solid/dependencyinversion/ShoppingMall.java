package com.bilgeadam.week04.lesson001.hw.solid.dependencyinversion;

public class ShoppingMall {
	
	public PaymentMethod paymentMethod;
	
	public ShoppingMall(PaymentMethod creditCard) {
		this.paymentMethod=creditCard;
	}
	
	public void doPayment(int amount) {
		paymentMethod.doTransaction(amount);
	}
	


	
}
