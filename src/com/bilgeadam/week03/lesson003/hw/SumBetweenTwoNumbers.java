package com.bilgeadam.week03.lesson003.hw;

public class SumBetweenTwoNumbers {

	public static void main(String[] args) {
		
		int toplam = sum(10,15);
		System.out.println(toplam);
	}
	//özyinelemeli method
	public static int sum(int start, int end) {
		if(end>start) {			
			int toplam = end + sum(start,end-1);
			return toplam;			
		}else {
			return end;
		}
	}
	// 15 + sum(10,14);
	// 15 + 14 + sum(10,13);
	// 15 + 14 + 13 + sum(10,12);
	// 15 + 14 + 13 + 12 +sum(10,11);
	// 15 + 14 + 13 + 12 + 11 +sum(10,10);
	// 15 + 14 + 13 + 12 + 11 + 10;

}
