package com.bilgeadam.week02.lesson004.arrays;

public class ExampleMaxMin {

	public static void main(String[] args) {

		int[] numbers = {56, 34, 1, 8, 101, -2, -33};
		
		int min = numbers[0];
		int max = numbers[0];
		
		for (int i : numbers) {
			if(i<min) {
				min=i;
			}
			if(i>max) {
				max=i;
			}
		}
		
		System.out.println("Max: " +max);
		System.out.println("Min: " + min);
	}

}
