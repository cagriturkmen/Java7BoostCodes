package com.bilgeadam.week03.lesson004;

import java.util.Scanner;

public class ToyCarTest {

	public static void main(String[] args) {
		
		ToyCar toyCar = new ToyCar();
		Scanner scanner = new Scanner(System.in);
		boolean condition=true;
		
		
		
		while(condition) {
			
			System.out.println("w-Move Forward\na-)Move Left\ns-)Move Backward\nd-)Move Right\nc-)Charge\ne-)Exit");
			
			String move = scanner.nextLine();
			
			switch (move) {
			case "w","W":
				toyCar.moveOneMeterForward();
				break;
			case "a","A":
				toyCar.moveOneMeterLeft();
				break;
			case "s","S":
				toyCar.moveOneMeterBackwards();
				break;
			case "d","D":
				toyCar.moveOneMeterRight();
				break;
			case "c","C":
				toyCar.charge();
				break;	
			case "e","E":
				condition=false;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			System.out.println("switchin dışı while'ın içi");
		}
		
		System.out.println("while'ın dışı");
	}

}
