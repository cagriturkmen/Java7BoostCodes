package com.bilgeadam.week02.lesson002.hospital;

public class Adult extends Person{

	@Override
	void checkUp() {
		// TODO Auto-generated method stub
		System.out.println("Saglik kontrolu yapildi");
	}

	@Override
	void examinePatient() {
		// TODO Auto-generated method stub
		System.out.println("Hasta muayenesi yapildi.");
	}

}
