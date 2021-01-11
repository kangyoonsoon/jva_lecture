package com.urdomain.ch03;

public class BitReverseOperatorExample {
	
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1  + 1;
		
		System.out.println(Integer.toBinaryString(v1) + " (십진수: " + v1 + ")");
	
	}
}
