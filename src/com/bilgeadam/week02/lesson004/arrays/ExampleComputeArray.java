package com.bilgeadam.week02.lesson004.arrays;

public class ExampleComputeArray {

	public static void main(String[] args) {

		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		double sum = 0;
		double average;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
//			double ort = sum/(i+1);
//			System.out.println(ort);
		}
		
		System.out.println("Toplam: "+sum);
		int arrayLength = numbers.length;
		average = sum/arrayLength;
		System.out.println("Ortalama: "+ average);
	}

}
