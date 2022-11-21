package com.bilgeadam.week03.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnimalList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		List<String> animals = new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		animals.add("mouse");
		animals.add("elephant");
		animals.add("bird");
		animals.add("fish");
		animals.add("horse");
		animals.add("frog");

		//System.out.println(animals.get(2));
		
		//System.out.println(animals.remove(4));
		
		animals.set(5, "platypus");
		
		for(String a : animals) {
		//	System.out.println(a);
		}
		
//		System.out.println(animals.size()); 
		
//		System.out.println(animals.isEmpty()); ;
//		System.out.println(numbers.isEmpty());
		
//		System.out.println(animals.contains("Monkey"));
//		String a="MONKEY";
//		System.out.println(a.equalsIgnoreCase("monkey"));
		
//		Scanner scan = new Scanner(System.in);	
//		String input= scan.nextLine();
//		boolean answer =animals.contains(input.toLowerCase());
//		System.out.println(answer);
		
		int a= animals.indexOf("dog");
	//	System.out.println(a);
		
		animals.set(1, "giraffe");
		for(String an : animals) {
			//	System.out.println(an);
			}
		
		List<String> animals2 =animals.subList(2, 6);
		for (String string : animals2) {
			//System.out.println(string);
		}		
	//	Collections.reverse(animals);
				
		Collections.sort(animals);
		Collections.reverse(animals);
				
		animals.clear();
		for(String an : animals) {
			System.out.println(an);
		}
	}

}
