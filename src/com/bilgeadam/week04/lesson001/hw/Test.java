package com.bilgeadam.week04.lesson001.hw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		BankAccount account1 = new CheckingAccount("Vsiz10002132", "Cagri'nin vadesiz hesabı");
		BankAccount account2 = new SavingsAccounts("Vli1000900212", "Cagrı'nın vadeli hesabı", 14);
		
		List<BankAccount> accounts = new ArrayList<>();
		
		accounts.add(account2);
		accounts.add(account1);
		
		Bank bank = new Bank("HSBC",accounts );
		
		System.out.println(bank);
		
		for (BankAccount bankAccount : bank.accounts) {
			if(bankAccount instanceof SavingsAccounts) {
				System.out.println(bankAccount);
			}
		}  
		
		
		
	}

}
