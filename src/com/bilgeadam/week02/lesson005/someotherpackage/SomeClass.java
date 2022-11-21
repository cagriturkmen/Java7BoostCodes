package com.bilgeadam.week02.lesson005.someotherpackage;

import com.bilgeadam.week02.lesson005.accessmodifiers.AccessModifierExample;

public class SomeClass extends AccessModifierExample {

	public static void main(String[] args) {
		
		AccessModifierExample access = new AccessModifierExample();
		SomeClass access2 = new SomeClass();
		
		System.out.println(access.publicVariable);	
		System.out.println(access2.protectedVariable);
	}

}
