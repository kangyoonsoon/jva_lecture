package com.urdomain.ch06;

public class Car213Example {

	public static void main(String[] args) {
		Car213 car1 = new Car213();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		Car213 car2 = new Car213("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		Car213 car3 = new Car213("자가용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		Car213 car4 = new Car213("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}

}