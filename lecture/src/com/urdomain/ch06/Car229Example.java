package com.urdomain.ch06;

public class Car229Example {

	public static void main(String[] args) {
		Car229 car = new Car229();
		
		car.keyTurnOn();
		car.run();
		
		int speed = car.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}

}
