package com.bilgeadam.week04.lesson001.hw;

public class CheckingAccount extends BankAccount{

	public CheckingAccount(String accountNumber, String accountName) {
		super(accountNumber, accountName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {

		balance = balance + amount ;
		
	}

	@Override
	public void withdraw(double amount) {
		
		if(amount>balance) {
			System.out.println("Yetersiz bakiye");
		}else {
			balance= balance - amount;
		}
		
	}

	
	
}
