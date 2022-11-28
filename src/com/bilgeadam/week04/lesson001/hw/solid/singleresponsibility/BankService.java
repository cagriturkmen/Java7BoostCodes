package com.bilgeadam.week04.lesson001.hw.solid.singleresponsibility;
//deposit(amount, accountNO)
//withdraw(amount, accountNO)
//hesapcüzdnı görünttüleme
//kredioranı bilgisini göstermme(Loantype)
//tek kullanımlık şifre gönderme(userId)
public class BankService {

	public double deposit(double amount, String accountNo ) {
		//kod
		return 0;
	}
	
	public double withdraw(double amount, String accountNo ) {
		//kod
		return 0;
	}
	
	public void printPassbook() {
		
	}
	
	public double getLoanInterestInfo(String loanType) {
		if(loanType.equals("homeloan")) {
			return 2.30;
		}
		if(loanType.equals("carloan")) {
			return 1.99;
		}
		if(loanType.equals("personalloan")) {
			return 2.00;
		}
		return 0;
	}
	public void sendOTP(String type) {
		if(type.equals("email")) {
			//email göndermekle alakalı bir implementasyon
			System.out.println("Email gönderildi.");
		}
	}
	
	
}
