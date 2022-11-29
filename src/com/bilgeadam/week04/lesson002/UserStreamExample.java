package com.bilgeadam.week04.lesson002;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserStreamExample {

	public static void main(String[] args) {
		
		User user3 = new User(1,"Aleyna");
		List<User> users = new ArrayList<>();
		users.add(user3);
		users.add(new User(2,"Ahmet"));
		users.add(new User(3,"Zehra"));
		users.add(new User(4,"Murat"));
		users.add(new User(5,"Yildiz"));
		users.add(new User(6,"Levent"));
		users.add(new User(7,"Elvan"));
	//	users.remove(5);
		
		users.stream()
		.forEach(user2-> System.out.println(user2));
		//stream foreachle user'ları konsola yaz.
		//Her kullanıcıdan önce ekrana Java8 yazsın.
//		users.stream()
//		.forEach(user ->{ System.out.println(user);
//				System.out.println("Java8");
//		});
		
	//	users.stream().forEach(user -> user.talk());
		//Method reference
		users.stream().forEach(User::talk);
		
		//User id'si 5ten büyükleri bulalım. Kaç adet olduğunu konsola yazdıralım
		long count= users.stream()
		.filter(user -> user.id>5)
		.count();
		System.out.println(count);
		
		
		Set<User> filteredList = users.stream()
		.filter(user -> user.id>5)
		.collect(Collectors.toSet());
			
		filteredList.stream().forEach(user-> System.out.println(user));
		
		
		List<User> mappedList = users.stream().map(user -> new User(user.id+100, user.name))
		.collect(Collectors.toList());
		mappedList.stream().forEach(user-> System.out.println(user));

		Map<Integer,String> userMap =
		users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));		
		userMap.forEach((key,value)-> System.out.println(key+"-"+value));
		
	}

}
