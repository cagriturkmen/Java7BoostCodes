package com.bilgeadam.week02.lesson003.constructor;

public class Computer {

	// zorunlu olacak ram ekran hdd 
	// bunlar olmasa da olur ssd ekran kartı
	
	public String ram;
	public String monitor;
	public String hdd;
	public String ssd;
	public String graphicCard;
	
	public Computer(String ram, String monitor, String hdd) {
		this.ram = ram;
		this.monitor = monitor;
		this.hdd = hdd;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", monitor=" + monitor + ", hdd=" + hdd + ", ssd=" + ssd + ", graphicCard="
				+ graphicCard + "]";
	}
	
	
	
	
}
