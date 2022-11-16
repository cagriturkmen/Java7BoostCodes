package com.bilgeadam.week02.lesson003.constructor;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer comp = new Computer("8GbRam","17' monitor","250GBhdd");
		comp.ssd="1tbssd";
		System.out.println(comp);
		
		Dell dell = new Dell("12GbRam","18' monitor","someHDd");
		dell.graphicCard="4gb graphics";
		System.out.println(dell);
	}

}
