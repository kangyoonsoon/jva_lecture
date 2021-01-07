package com.urdomain.test;

import java.util.Scanner; 

public class CoffeeVendingMachineExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Customer 객체 생성 
		int money = 50000;
		int item = 1;
		Customer customer1 = new Customer(money);
		
		// 커피 자판기 객체 생성 
		CoffeeVendingMachine coffee = new CoffeeVendingMachine("삼성", "CFGQ-2012", "음료수 & 커피", customer1, "맥심");
		// 사먹기 전 구매자
		printLine(customer1);
		// 자판기 정보 
		coffee.showVendingMachineInforamtion();
		// 자판기 상태 
		coffee.showCoffeeVendingMachineStatus();
		
		// 제품 판매 프로세스
		// 금액 입력을 한다 - 돈을 자판기에 투입한다.
		printn("투입할 금액: ");
		money = scanner.nextInt();
		coffee.inputMoneyByCustomer(money);
		
		while (coffee.inputMoney >= 500) { // TOFIX - 1000 -> min value			
			int orderOrExit = 1;
			int selection = 1;
			
			printLine("차가운 음료수를 드시겠습니까? 선택 < 1 > : ");
			printn("뜨거운 커피를 드시겠습니까?  선택 < 2 > : ");
			selection = scanner.nextInt();
			if (selection == 1) {				
				printn("음료수 선택: ");
				item = scanner.nextInt();
				coffee.selectItems(coffee.numberToString(item));
				printn("거스름 버튼을 누르겠습니까? (1 번 : 계속 주문, 2 번: 거스름돈 버튼을 누른다.-종료-):   ");
				orderOrExit = scanner.nextInt();
			} else { // 뜨거운 커피 선택
				printn("커피 선택: ");
				item = scanner.nextInt();
				coffee.selectCoffee(coffee.numberToStringForCoffee(item));
				printn("거스름 버튼을 누르겠습니까? (1 번 : 계속 주문, 2 번: 거스름돈 버튼을 누른다.-종료-):   ");
				orderOrExit = scanner.nextInt();
			}
			if (orderOrExit == 2) {
				break;
			} else {
				
			}
		}
		printLine("\n\n감사합니다.\n음료수와 거스름돈을 챙겨가세요.\n");

		scanner.close();
				
		// 제품을 선택- 물건이 나오고
			// 잔액이 나오고 - (거스름돈 버튼을 누른다.)

		coffee.showVendingMachineStatus();
		printLine("거스름돈: " + coffee.getChange() + "원\n");
		// 제품이 나오고 나서 구매자, 자판기 상태
		printLine(customer1);
		// 구매목록 보여주기
		coffee.showPurchasedItems();
		// 현재까지 수익을 확인한다.
		printLine("=======================");
		printLine("자판기 총 수입: "+coffee.getTotalMoney() + "원");
		printLine("=======================");

		
	}
	
	
	public static void printLine(Customer c) {
		System.out.println(c);
	}
	public static void printLine() {
		System.out.println();
	}
	public static void printLine(String str) {
		System.out.println(str);
	}
	public static void printLine(int a) {
		System.out.println(a);
	}
	public static void printn(String str) {
		System.out.print(str);
	}

}
