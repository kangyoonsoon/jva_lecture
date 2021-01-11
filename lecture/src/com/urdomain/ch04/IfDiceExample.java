package com.urdomain.ch04;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		if (num == 1) {
			System.out.println("1 번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2 번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3 번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4 번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5 번이 나왔습니다.");
		} else {
			System.out.println("6 번이 나왔습니다.");
		}
	}
}
