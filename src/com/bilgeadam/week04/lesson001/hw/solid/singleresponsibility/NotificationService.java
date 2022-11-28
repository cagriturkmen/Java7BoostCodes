package com.bilgeadam.week04.lesson001.hw.solid.singleresponsibility;

public class NotificationService {
	
	public void sendOTP(String type) {
		if(type.equals("email")) {
			//email göndermekle alakalı bir implementasyon
			System.out.println("Email gönderildi.");
		}
		if(type.equals("sms")) {
			System.out.println("Sms gönderildi.");
		}
		
	}
}
