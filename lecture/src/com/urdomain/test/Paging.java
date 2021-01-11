package com.urdomain.test;

// << < 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10> >>
// a = 10 b = 5 c = 16
public class Paging {

	public static void main(String[] args) {
		Paging pg = new Paging();
		pg.generatePageViewer(8);
		pg.generatePageViewer(12);
		pg.generatePageViewer(60);
		pg.generatePageViewer(71);
		pg.generatePageViewer(140);
	}
	
	public void generatePageViewer(int num) {

		int startNum = num / 10;
		
		System.out.print("<< ");
		if ((num > 10 && num % 10 == 0) || (num > 10 && num % 10 == 1)) { // 첫번째 마지막 숫자일 경우 ex) 10, 11, 20, 21 가운데 위치하도록 한다.
			for (int i = (startNum * 10) -4 ; i <= (startNum * 10) + 5; i++) {
				if (i == (startNum * 10) + 5) {				
					if (i == num) {
						System.out.println("*" + i + "*");
					} else {					
						System.out.print(i);
					}
				} else {
					if (i == num) {
						System.out.print("*" + i + "*"  + " | ");
					} else {					
						System.out.print( i + " | ");
					}
				}
			}
		} else {  
			for (int i = (startNum * 10) + 1 ; i <= (startNum * 10) + 10; i++) {
				if (i == (startNum * 10) + 10) {				
					if (i == num) {
						System.out.println("*" + i + "*");
					} else {					
						System.out.print(i);
					}
				} else {
					if (i == num) {
						System.out.print("*" + i + "*"  + " | ");
					} else {					
						System.out.print( i + " | ");
					}
				}
			}
		}
		System.out.print(" >>");
		System.out.println();
	}
}
