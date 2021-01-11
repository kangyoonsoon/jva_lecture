package com.urdomain.ch03;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput); // value = NaN
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println("val: " + val); //NaN
		System.out.println("currentBalance: " + currentBalance);
	}
}
