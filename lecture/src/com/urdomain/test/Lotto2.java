package com.urdomain.test;

import java.util.Arrays;

public class Lotto2 {

	int[] lottoNumbers = new int[6];
	int[] copiedlottoNumbers = new int[6];
	boolean isDuplicatedNum = true;
	
	public boolean validateDuplicatoin (int[] lotto) {
		// 정렬
		Arrays.sort(lotto);
		
		for( int i = 1; i < lotto.length; i++ ) {
			if ( lotto[i] == lotto[i-1] ) {
				System.out.println("중복된 숫자가 검색되었습니다.");
				System.out.println("--------다시 실행--------");
				return true;	
			} else {
				//pass
			}
		}
		return false;
	}
	
	public void printLotto (int[] arr) {
		for (int idx = 1; idx < arr.length + 1; idx++)
			System.out.print(idx + "\t");
		
		System.out.println();
		System.out.println("--------------------------------------------");
		for (int num: arr) {
			System.out.print(num + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Lotto2 lotto = new Lotto2();
		
		while (lotto.isDuplicatedNum) {		
			// 로또 번호 생성
			for( int i = 0; i < lotto.lottoNumbers.length; i++ ) {
				lotto.lottoNumbers[i] =  (int)(Math.random() * 45) + 1;
			}
			
			// array copy
			System.arraycopy(lotto.lottoNumbers, 0, lotto.copiedlottoNumbers, 0, lotto.lottoNumbers.length);
			
			// validation for duplicated number			
			// [print and exit] or [go back to while]
			if (!lotto.validateDuplicatoin(lotto.copiedlottoNumbers)) {
				lotto.printLotto(lotto.lottoNumbers);
				lotto.isDuplicatedNum = false;					
			} else {
				//
			}
		}

	}

}
