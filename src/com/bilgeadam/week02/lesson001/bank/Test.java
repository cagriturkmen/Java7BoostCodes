package com.bilgeadam.week02.lesson001.bank;

public class Test {

	public static void main(String[] args) {
			
		Ziraat ziraat = new Ziraat();
		System.out.println(ziraat.rateOfInterest());
	
		Garanti g = new Garanti();
		float rate = g.rateOfInterest();
		//calculateAnnualIncome(rate);
		System.out.println(rate);
	
	}

}
