package com.bilgeadam.week04.lesson002;

public class User {
	
	int id;
	String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void talk() {
		System.out.println("Hi, I am "+this.name);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
