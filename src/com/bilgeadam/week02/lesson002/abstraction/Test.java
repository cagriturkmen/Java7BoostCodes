package com.bilgeadam.week02.lesson002.abstraction;

public class Test {

	//Animal class'ı makeSound
	//Dog hav hav / Cat miyav 
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.animalSound();
		
		Animal dog = new Dog();
		dog.animalSound();
	}

}
