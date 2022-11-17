package com.bilgeadam.week02.lesson004.hw;

public class Address {
	
	public String city;
	public String street;
	
	public Address(String city, String street) {
		this.city = city;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	
	
	
}
