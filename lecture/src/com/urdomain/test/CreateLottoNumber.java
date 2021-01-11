package com.urdomain.test;

// Lotto class에 다시 작성
public class CreateLottoNumber {
	public static void main(String[] args) {
		
		int[] lottoNumbers = new int[6];
		
		for(int i = 0; i < lottoNumbers.length; i++ ) {
			lottoNumbers[i] =  (int)(Math.random() * 45) + 1;
		}
		
		for (int idx = 1; idx < lottoNumbers.length + 1; idx++)
			System.out.print(idx + "\t");
		
		System.out.println();
		System.out.println("--------------------------------------------");
		for (int i: lottoNumbers) {
			System.out.print( i + "\t");
		}
		System.out.println();	
		
	}
}
