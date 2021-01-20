package com.urdomain.ch10;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		
		
		
		if ((args.length == 2)) {
			String data1 = args[0];
			String data2 = args[1];
			if ((isInteger(data1)) && (isInteger(data2))) {
				
				int result = Integer.parseInt(data1) + Integer.parseInt(data2);
				System.out.println(result);
			} else {
				System.out.println("Not working");
			}
		} else {
			System.out.println("Not working");
		}
		

	}
	
	public static boolean isInteger(String str) {
		
		for (char c: str.toCharArray()) {
			if (c != '0' || 
					c != '1' || 
					c != '2' || 
					c != '3' || 
					c != '4' || 
					c != '5' || 
					c != '6' || 
					c != '7' ||
					c != '8' || 
					c != '9') {
				System.out.println("숫자 아닌 값 입력");
				return false;
			} 
 			
		}
		return true;
	}
	

}
