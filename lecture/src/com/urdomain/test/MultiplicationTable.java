package com.urdomain.test;

public class MultiplicationTable {
	
	public void showTwoMultiTable(int a, int b) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + + i + " = " + ( a * i ));
		}
		System.out.println("------------");
		for (int j = 1; j <= 9; j++) {
			System.out.println(b + " * " + + j + " = " + ( b * j ));
		}
	}
	public static void main(String[] args) {
		MultiplicationTable mt = new MultiplicationTable();
		// 구구단 7단, 3단 출력
		mt.showTwoMultiTable(7, 3);
	}
}