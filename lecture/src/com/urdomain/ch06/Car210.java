package com.urdomain.ch06;

public class Car210 {
	// 필드
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car210() {
		
	}
	
	Car210(String company, int maxSpeed){
		this.company = company;
		this.maxSpeed = maxSpeed;
	}
	
	Car210(String model){
		this.model = model;
	}
	
	Car210(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car210(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
