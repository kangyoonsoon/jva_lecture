package com.urdomain.ch05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		
		for( int score : scores ) {
			sum += score;
		}
		System.out.println("총합: " + sum);
		
		double avg = 0.0;
		if (scores.length != 0) {
			avg = (double) sum / scores.length;
		} else {
			//pass
		}
		
		System.out.println("평균: " + avg);
	}
}
