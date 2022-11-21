package com.bilgeadam.week02.lesson005.accessmodifiers;

public class SomeOtherClass {
	
	public static void main(String[] args) {
		
		AccessModifierExample access = new AccessModifierExample();
		System.out.println(access.publicVariable);		
		System.out.println(access.defaultVariable);
		System.out.println(access.protectedVariable);
	
	}
}