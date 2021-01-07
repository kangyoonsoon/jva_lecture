package com.urdomain.test;

public class CoffeeVendingMachine extends VendingMachine {

	String coffeeBrand = "";
	String[] coffeeTypes = {"일반커피", "밀크커피", "블랙커피", "프림커피", "스페셜커피"};
	int[]coffeeCost = {500, 500, 800, 500, 1000};
	
	
	// 생성자
	public CoffeeVendingMachine(String brand, String model, String itemsOfMachine, String coffeeBrand) {
		super(brand, model, itemsOfMachine);
		this.coffeeBrand = coffeeBrand;
	}
	// 생성자 오버로드 ***
	public CoffeeVendingMachine(String brand, String model, String itemsOfMachine, Customer customer, String coffeeBrand) {
		super(brand, model, itemsOfMachine, customer);
		this.coffeeBrand = coffeeBrand;
	}
	// 생성자 오버로드
	public CoffeeVendingMachine(String brand, String model, String itemsOfMachine, Customer customer,
			int[][] costAndNum, String[] purchasedItems, String address, int availablePayment, int builtYear,
			Components[] beverages) {
		super(brand, model, itemsOfMachine, customer, costAndNum, purchasedItems, address, availablePayment, builtYear,
				beverages);
	}
	
	// 메소드 오버라이딩
	// return : void 기본정보 보여준다.
	public void showVendingMachineInforamtion() {
		printLine("===================================================================");
		printLine("브랜드: " + getBrand());
		printLine("모델명: " + getModel());
		printLine("아이템: " + getItemsOfMachine());
		printLine("장소: " + getAddress());
		printLine("자판기 설치 년도: " + getBuiltYear());
		printLine("결제: " + getPaymentTool(getAvailablePayment()));
		printLine("신분증 요구: " + checkId18(isRequiredID()));
		printLine("커피 브랜드: " + getCoffeeBrand()); //***
		printLine("===================================================================");
		printLine();
	}
	

	// intput number -> output -> item
	public String numberToStringForCoffee(int itemNumber) {
		String selectedItem = "";
		if (itemNumber < 0 || itemNumber > coffeeTypes.length) {			
			printLine("잘못된 입력");
			return "No item";
		} else {
			selectedItem = coffeeTypes[itemNumber - 1];
		}
		return selectedItem;
	}
	
	// 메소드
	public void selectCoffee(String selectedItem) {
		if (selectedItem == "No item") {
			return;
		} else {
			int idx = 0;
			int costForItem = 0;
			int forChange = 0;
			
			for (int i = 0; i < coffeeTypes.length; i++) {
				if (selectedItem.equals(coffeeTypes[i])) {
					idx = i;
				} else {
					//pass
				}
			}
			costForItem = coffeeCost[idx];
			// 선택된 아이템
			printLine("선택된 아이템: " + coffeeTypes[idx]);
			// 구매 목록 Array에 추가
			purchasedItems[arrayIdx] = coffeeTypes[idx];
			arrayIdx++;
			setArrayIdx(arrayIdx);
			// 거스름돈
			forChange  = inputMoney - costForItem;
			setChange(forChange); // change = 000
			
			// 투입된 돈 감소
			setInputMoney((inputMoney - costForItem));
			// 자판기 총액 증가
			setTotalMoney((costForItem + totalMoney));
			
			// customer 돈 감소
			customerMoney -= costForItem;
			customer.setMyMoney(customerMoney);
		}
	}

	// 커피 자판기 상태 
	public void showCoffeeVendingMachineStatus() {
		super.showVendingMachineStatus();
		printLine("--- 커피 자판기 상태 ---");
		printNoLine("번호 :	");
		for (int i = 1; i <= coffeeTypes.length ;i++) {
			printNoLine(i + "\t");
		}
		printLine();
		printNoLine("아이템:	");
		for (String coffee : coffeeTypes) {
			printNoLine(coffee + "\t");
		}
		printLine();
		printNoLine("가격:	");

		for (int i = 0; i < coffeeCost.length; i++) {
			printNoLine(coffeeCost[i] + "\t");
		}
		printLine();
		printLine("-----  END  -----");
		printLine();
	}
	
	// Getter & Setter Methods
	public String getCoffeeBrand() {
		return coffeeBrand;
	}
	public void setCoffeeBrand(String coffeeBrand) {
		this.coffeeBrand = coffeeBrand;
	}
	public String[] getCoffee() {
		return coffeeTypes;
	}
	public void setCoffee(String[] coffee) {
		this.coffeeTypes = coffee;
	}
}
