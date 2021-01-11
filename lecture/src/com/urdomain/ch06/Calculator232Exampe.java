package com.urdomain.ch06;

public class Calculator232Exampe {

	public static void main(String[] args) {
		Calculator232 cal = new Calculator232();
		double result1 = cal.areaRectangle(10);
		double result2 = cal.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}

}
