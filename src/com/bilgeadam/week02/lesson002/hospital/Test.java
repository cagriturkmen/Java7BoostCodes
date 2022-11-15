package com.bilgeadam.week02.lesson002.hospital;

public class Test {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.name="Cagri";
		child.age=15;
		child.isHealty=true;
		
	//	child.checkIfHealty();
		child.getVaccine();
		
		Adult adult = new Adult();
		adult.isHealty=true;
	//	adult.checkIfHealty();	
	
	}

}
