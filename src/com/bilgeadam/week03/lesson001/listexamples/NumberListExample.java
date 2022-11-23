package com.bilgeadam.week03.lesson001.listexamples;

import java.util.ArrayList;
import java.util.List;

public class NumberListExample {

	public static void main(String[] args) {

		List<Integer> oddNumbers = new ArrayList<>();
		List<Integer> evenNumbers = new ArrayList<>();
		//fori
		for (int i = 0; i < 101; i++) {
			if(i%2 == 0) {
				evenNumbers.add(i);
			}else {
				oddNumbers.add(i);
			}
		}		
//		System.out.println(evenNumbers);
//		System.out.println(oddNumbers);
		System.out.println(); ;
		List<Integer> removeNumbers = evenNumbersLessThanTen(evenNumbers);
		removeList(evenNumbers,removeNumbers);
		//System.out.println(newList);
//		System.out.println(oddNumbers);
//		System.out.println(evenNumbers);
	}
	
	public static List<Integer> evenNumbersLessThanTen(List<Integer> numbers) {
		List<Integer> removeNumbers = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i)%2 == 0 && numbers.get(i)<10) {
				removeNumbers.add(numbers.get(i));
			}
		}
		return removeNumbers;
	}
	
	public static void removeList(List<Integer> numbers, List<Integer> removeNumbers) {
		
		for (int i = 0; i < removeNumbers.size(); i++) {
			if(numbers.contains(removeNumbers.get(i))) {
				numbers.remove(removeNumbers.get(i));
			}
		}
	
	}
	

}
