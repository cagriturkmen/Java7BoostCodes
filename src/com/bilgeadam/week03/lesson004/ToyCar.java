package com.bilgeadam.week03.lesson004;

public class ToyCar {
	
	private int batteryCapacity=5;
	int distanceX=0;
	int distanceY=0;
	
	
	
	void charge() {
		if(batteryCapacity>=5) {
			System.out.println("Battery Full.!");
		}else {
			batteryCapacity++;
			remainingBattery();
		}
	}
	
	private void remainingBattery() {
		System.out.println("Remaining battery:" + batteryCapacity);
		if(batteryCapacity<=0) {
			System.out.println("Dead Battery! Please charge!");
		}
	}
	
	void moveOneMeterForward() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
			distanceY++;
			batteryCapacity--;
			System.out.println("Current Position : " +distanceX+", "+distanceY);
			remainingBattery();
		}
	}
	void moveOneMeterBackwards() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
			distanceY--;
			batteryCapacity--;
			System.out.println("Current Position : " +distanceX+", "+distanceY);
			remainingBattery();
		}
	}
	void moveOneMeterRight() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
			distanceX++;
			batteryCapacity--;
			System.out.println("Current Position : " +distanceX+", "+distanceY);
			remainingBattery();
		}
	}
	void moveOneMeterLeft() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
			distanceX--;
			batteryCapacity--;
			System.out.println("Current Position : " +distanceX+", "+distanceY);
			remainingBattery();
		}
	}
	
}
