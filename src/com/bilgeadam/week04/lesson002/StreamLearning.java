package com.bilgeadam.week04.lesson002;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamLearning {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(63);
		
		//foreach
//		for (Integer number : list) {
//			System.out.println(number);
//		}		
//		list.stream()
//		.forEach(number -> { 
//		System.out.println(number);
//		System.out.println("Stream");
//		});
		
		//filter
//		list.stream()
//		.filter(number -> number>60)
//		.forEach(number -> System.out.println(number));
		
		//distinct	
//		list.stream()
//		.distinct()
//		.forEach(number -> System.out.println(number));
		
		//sorted
//		list.stream()
//		.sorted()
//		.forEach(number -> System.out.println(number));
		
		//sortedV2
//		list.stream()
//		.sorted(Comparator.reverseOrder())
//		.forEach(number -> System.out.println(number));
		
		//limit
//		list.stream()
//		.limit(5)
//		.forEach(number -> System.out.println(number));
		
		//skip
//		list.stream()
//		.skip(5)
//		.limit(2)
//		.forEach(number -> System.out.println(number));
		
		//count
		long count =list.stream()
		.filter(number -> number<40)
		.distinct()
		.count();
	//	System.out.println(count);
		
		//anyMatch
		boolean match =list.stream()
		.anyMatch(number -> number<5);
	//	System.out.println(match);
		
		//allMatch
		boolean match2= list.stream()
		.allMatch(number-> number<101);
	//	System.out.println(match2);
		
		//noneMatch
		boolean match3= list.stream()
		.noneMatch(number-> number<2);
	//	System.out.println(match3);
		
		//map
//		list.stream()
//		.map(number -> number*2)
//		.forEach(number -> System.out.println(number));
//		
//		list.stream().forEach(number -> 
//			System.out.println(number));
		
		//map
		list.stream()
		.map(number -> Math.sqrt(number))
		.forEach(number-> System.out.println(number));
		
		
	
	}
}
