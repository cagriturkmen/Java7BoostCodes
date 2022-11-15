package com.bilgeadam.week02.lesson002.hospital;

public abstract class Person {

	public String name;
	public int age;
	public boolean isHealty;
	
	
	void checkIfHealty() {
		if(isHealty == true) {
			checkUp();
		}else {
			examinePatient();
			givePerscription();
		}
	}
	
	abstract void checkUp();
	abstract void examinePatient();
	
	void givePerscription() {
		System.out.println("Yapılan muayene sonucuna göre reçete yazıldı.");
	}
}
