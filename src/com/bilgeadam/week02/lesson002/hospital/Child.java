package com.bilgeadam.week02.lesson002.hospital;

public class Child extends Person {
	//Clean code
	public Child() {
		
	}

	@Override
	void checkUp() {
		
		System.out.println("Cocuga bir seker verildi");
		System.out.println("Kontroller yapıldı.");
	}

	@Override
	void examinePatient() {
		
		System.out.println("Oyun esliğinde muayene yapıldı.");
	}
	
	void getVaccine() {
		System.out.println("Kizamik asisi yapildi");
	}
	

}
