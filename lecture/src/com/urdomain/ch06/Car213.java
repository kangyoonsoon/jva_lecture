package com.urdomain.ch06;

public class Car213 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car213(){

	}
	
	Car213(String model){
		this(model, "은색", 250);
	}
	
	Car213(String model, String color){
		this(model, color, 250);
	}
	
	Car213(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}	
}
