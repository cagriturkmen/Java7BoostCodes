package com.bilgeadam.week01.lesson004;

public class Test {

	public static void main(String[] args) {
		
		Computer comp = new Computer();
		comp.brand = "Monster";
		comp.ramSize =8;
		comp.screenSize= 13.2;
		comp.showProperties();
		
		Computer comp2 = new Computer();
		comp2.brand = "Apple";
		comp2.connectWeb();
		
		Laptop laptop = new Laptop();
		laptop.brand="Acer";
		laptop.ramSize=16;
		laptop.screenSize=15.3;
		laptop.connectWeb();
		laptop.batteryCapacity=95;
		laptop.remainingBattery();
		
	}

}
