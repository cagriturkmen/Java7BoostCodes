package com.bilgeadam.week04.lesson002;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonStreamApiExample {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person("Whittaker","Godleman","Male",32));
		personList.add(new Person("Merola","Wrout","Female",32));
		personList.add(new Person("Melosa","Courage","Female",14));
		personList.add(new Person("Sydney","Cullington","Female",74));
		personList.add(new Person("Sherwin","Ogley","Male",14));
		personList.add(new Person("Dukie","Malpass","Male",30));
		personList.add(new Person("Jarrett","Fearick","Male",77));
		personList.add(new Person("Willie","Childerhouse","Male",31));
		personList.add(new Person("Berky","Tollmache","Male",73));
		personList.add(new Person("Nanete","Blunsden","Female",81));
		
		
		Map<String,Integer> filteredMap =  personList.stream()
		.filter(person -> person.age<50)
		.collect(Collectors.toMap(person-> person.name, person -> person.age));
		
		filteredMap.forEach((key,value) -> System.out.println(key+"-"+value));
		
		
		List<Person> filteredList = personList.stream()
				.filter(person -> person.age<35 && person.gender.equalsIgnoreCase("male"))
				.collect(Collectors.toList());
		
		filteredList.forEach(Person::speak);
		
		
		Set<Person> futureMaleList = personList.stream()
				.filter(person -> person.gender.equalsIgnoreCase("male"))
				.map(person -> new Person(person.name,person.lastname,person.gender,person.age+15))
				.collect(Collectors.toSet());
		
		futureMaleList.forEach(person -> System.out.println(person.age+ "-"+ person.name));
	}

}
