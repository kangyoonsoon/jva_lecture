package com.urdomain.ch03;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y; // Infinity
		double t = x % y; // NaN
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(t));
	}
}
