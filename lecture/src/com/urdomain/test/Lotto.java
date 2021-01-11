package com.urdomain.test;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		
		int[] lottoNumbers = new int[6];
		int[] copiedlottoNumbers = new int[6];
		boolean isDuplicatedNum = false;
		boolean isDetectDuplicatedNum = false;	
		
		Lotto lotto = new Lotto();
		
		while (!isDuplicatedNum) {		
			
			// 로또 번호 생성
			for( int i = 0; i < lottoNumbers.length; i++ ) {
				lottoNumbers[i] =  (int)(Math.random() * 45) + 1;
			}
			
			// array copy
			System.arraycopy(lottoNumbers, 0, copiedlottoNumbers, 0, lottoNumbers.length);
			
			// copy된 array 정렬
			Arrays.sort(copiedlottoNumbers);
			
			// validation for duplicated number
			isDetectDuplicatedNum = lotto.validationDuplicatoin(copiedlottoNumbers);
			
			// 출력
			if (!isDetectDuplicatedNum) {
				for (int idx = 1; idx < lottoNumbers.length + 1; idx++)
					System.out.print(idx + "\t");
				
				System.out.println();
				System.out.println("--------------------------------------------");
				for (int i: lottoNumbers) {
					System.out.print( i + "\t");
				}
				System.out.println();	
				isDuplicatedNum = true;					
				isDetectDuplicatedNum = false;
				
			} else {
				isDetectDuplicatedNum = false;
			}
		}	
	}
	
	public boolean validationDuplicatoin (int[] lotto) {
		for( int i = 1; i < lotto.length; i++ ) {
			if ( lotto[i] == lotto[i-1] ) {
				System.out.println("중복된 숫자가 검색되었습니다.");
				System.out.println("--------다시 실행 --------");
				return true;	
			} else {
				//pass
			}
		}
		return false;
	}
}
//중복 숫자 X