package com.bilgeadam.week02.lesson003.composition;

public class Engine {
	
	public String type;
	public int horsePower;
	
	public Engine(String type, int horsePower) {
		this.type = type;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", horsePower=" + horsePower + "]";
	}
	
	
	
}
