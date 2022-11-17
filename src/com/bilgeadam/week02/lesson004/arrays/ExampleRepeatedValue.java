package com.bilgeadam.week02.lesson004.arrays;

public class ExampleRepeatedValue {

	public static void main(String[] args) {
		
		int[] arr = {3,7,12,43,54,43,28,3,19,-24,-19};
		int sayac = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						if(sayac==0) {
							System.out.println(arr[i]);
						sayac++;
						}
					}

				}
				sayac=0;
			}
		
		
	}

}
