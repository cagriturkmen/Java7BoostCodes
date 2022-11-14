package com.bilgeadam.week01.lesson004;

public class Computer {

	public String brand;
	public int ramSize;
	public double screenSize;
	
	
	public void connectWeb() {
		System.out.println(brand + "internete bağlandı");		
	}
	
	public void showProperties() {
		System.out.println("Computer [brand=" + brand + ", ramSize=" + ramSize + ", screenSize=" + screenSize + "]");;
	}

}
