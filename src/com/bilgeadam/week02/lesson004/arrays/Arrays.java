package com.bilgeadam.week02.lesson004.arrays;

public class Arrays {

	public static void main(String[] args) {

		double[] data;	
		data = new double[10];
		
		double[] data2 = new double[5];		
		
		int[] age2 = new int[5];
		age2[0] = 12;
		age2[1] = 4;
		age2[2] = 5;
		
		int[] age = {12,4,5,6,7};
		
//		System.out.println("First element: " + age[0]);
//		System.out.println("Second element: " + age[1]);
//		System.out.println("Fifth element: " + age[4]);
		
//		System.out.println(age.length);
		
		//loop through the array
		//fori
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]+1);
		}
		//->
		
		//foreach
		for (int i : age) {
			System.out.println(i);
		}
		
		//Arrays.toString
		   System.out.println(java.util.Arrays.toString(age));
		   
		   int a = Integer.MIN_VALUE;
	}

}
