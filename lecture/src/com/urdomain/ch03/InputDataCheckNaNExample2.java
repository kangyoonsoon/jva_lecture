package com.urdomain.ch03;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput); // value = NaN
		
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		} else {
			//pass
		}
		currentBalance += val;
		System.out.println("currentBalance: " + currentBalance);
	}
}
