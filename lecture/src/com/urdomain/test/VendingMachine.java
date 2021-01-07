package com.urdomain.test;

public class VendingMachine {
	
	Customer customer = null;
	int customerMoney = 0;
	String brand = "";
	String model = "";
	String itemsOfMachine = "";	
	// Enum - Components.java로 교체
	//	String[] items = {"콜라", "사이다", "밀키스", "비타500", "레쓰비", "환타", "봉봉", "조지아"};
	Components[] beverages = Components.values(); 
	int[][] costAndNum = {
			{1000, 1000, 1500, 1200, 1000, 1000, 2000, 800},
			{30, 20, 10, 30, 55, 22, 60, 40}
	};
	String[] purchasedItems = new String[100];
	int totalMoney = 0;
	String address = "서울 이대역 6번출구 앞";
	int availablePayment = 3; // only cash = 1, credit card =2, (cash || credit card) = 3, ( + new payment skills) = 4 
	int builtYear = 2015;
	int inputMoney = 0; // 고객 들어간돈
	int change = 0; // 고객 거스름 돈?????
	int status = 1; // 1 = normal; 2 = need to add money; 3 = need to fix; 
	int arrayIdx = 0;
	
	boolean requiredID = false;  // 신분증 요구
	
	// 생성자
	VendingMachine(String brand, String model, String itemsOfMachine){
		
		this.brand = brand;
		this.model = model;
		this.itemsOfMachine = itemsOfMachine;
	}
	// 생성자 오버로딩
	VendingMachine(String brand, String model, String itemsOfMachine, Customer customer){
		this.brand = brand;
		this.model = model;
		this.itemsOfMachine = itemsOfMachine;
		this.customer = customer;
		this.customerMoney = customer.getMyMoney();
	}
	VendingMachine(String brand, String model, String itemsOfMachine, Customer customer, int[][] costAndNum, String[] purchasedItems, String address, int availablePayment, int builtYear, Components[] beverages){

		this.brand = brand;
		this.model = model;
		this.itemsOfMachine = itemsOfMachine;
		this.customer = customer;
		this.customerMoney = customer.getMyMoney();
		this.costAndNum = costAndNum;
		this.purchasedItems = purchasedItems;
		this.address = address; 
		this.availablePayment = availablePayment;
		this.builtYear = builtYear;
		this.beverages = beverages;
	}
	
	// ----------  methods -----------
	
	// total money 구하기
	/*
	public int calcuateTotalMoney(int[] cost, int[] items) {
		for (int idx: cost) {
			totalMoney += cost[idx] * items[idx];
		}
		return totalMoney;
	}
	*/
	public int calcuateTotalMoney(int[] cost, int[] arrItems) {
		for (int idx: cost) {
			totalMoney += cost[idx] * arrItems[idx];
		}
		return totalMoney;
	}
	

	public boolean checkId18(boolean requiredID) {
		
		if (requiredID) {
			printLine("신분증이 필요합니다.");
			return true;
		} else {
			printLine("신분증이 필요하지 않습니다.");
			return false;
		}
	}
	
	
	public void putPaymentTool(String paymentTool){

		printNoLine("결제: ");
		switch(paymentTool) {
		case "cash":
			printLine("only cash");
			setAvailablePayment(1);
			break;
		case "card":
			printLine("credit card");
			setAvailablePayment(2);
			break;
		case "both":
			printLine("cash 또는 credit card");
			setAvailablePayment(3);
			break;
		default:
			printLine("새로운 결제 시스템 지원");
			setAvailablePayment(4);
			break;
		}
		
	}

	public String getPaymentTool(int toolNum){
		
		if (this.availablePayment == 1) {
			return "cash";
		} else if(this.availablePayment == 2) {
			return "card";
		} else if (this.availablePayment == 3) {
			return "both";
		} else {
			return "new payment";
		}
		
	}
	

	// return : void 기본정보 보여준다.
	public void showDetailVendingMachine() {
		printLine("===================================================================");
		printLine("브랜드: " + getBrand());
		printLine("모델명: " + getModel());
		printLine("아이템: " + getItemsOfMachine());
		printLine("장소: " + getAddress());
		printNoLine("품명:	");		
		printLine("자판기 설치 년도: " + getBuiltYear());
		printLine("결제: " + getPaymentTool(getAvailablePayment()));
		printLine("신분증 요구: " + checkId18(isRequiredID()));
		printLine("===================================================================");
		printLine();
	}
	
	
	// vending machine status 
	public void showVendingMachine() {
		printLine("--- 자판기 상태 ---");
		printNoLine("번호 :	");
		for (int i = 1; i <= beverages.length ;i++) {
			printNoLine(i + "\t");
		}
		printLine();
		printNoLine("아이템:	");
		for (Components beverage : beverages) {
			printNoLine(beverage + "\t");
		}
		printLine();
		printNoLine("가격:	");

		for (int i = 0; i < costAndNum[0].length; i++) {
			printNoLine(costAndNum[0][i] + "\t");
		}
		printLine();
		printNoLine("갯수:	");

		for (int j = 0; j < costAndNum[1].length; j++) {
			printNoLine(costAndNum[1][j] + "\t");
		}
		printLine();
		printLine("자판기 수익: " + getTotalMoney() + "원");
		printLine("-----  END  -----");
		printLine();
	}
	// 고객으로 부터 돈을 받는다.
	public void inputMoneyByCustomer(int moneyFromCustomer) {		
		inputMoney += moneyFromCustomer;
		printLine("투입된 돈:" +  inputMoney + "원");
		setInputMoney(inputMoney);
	}
	
	// 특정 음료수 "한 개"를 선택받는다. 
	public void selectItems(String selectedItem) {
		if (selectedItem =="No item") {
			return;
		} else {
			int idx = 0;
			int costForItem = 0;
			int forChange = 0;
			
			for (int i = 0; i < beverages.length; i++) {
				if (selectedItem.equals(beverages[i].name())) {
					idx = i;
				} else {
					//pass
				}
			}
			costForItem = costAndNum[0][idx];
			// 선택된 아이템
			printLine("선택된 아이템: " + beverages[idx].name());
			// 구매 목록 Array에 추가
			purchasedItems[arrayIdx] = beverages[idx].name();
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
			
			// item 개수 1 감소
			if (costAndNum[1][idx] <= 0) {
				printLine(beverages[idx].name() + " 의 개수가 0입니다.");
			} else {			
				costAndNum[1][idx]--;
			}
		}
		
	}
	
	public int getArrayIdx() {
		return arrayIdx;
	}

	public void setArrayIdx(int arrayIdx) {
		this.arrayIdx = arrayIdx;
	}

	// intput number -> output -> item
	public String numberToString(int itemNumber) {
		String selectedItem = "";
		if (itemNumber < 0 || itemNumber > beverages.length) {			
			printLine("잘못된 입력");
			return "No item";
		} else {
			selectedItem = beverages[itemNumber - 1].name();
		}
		return selectedItem;
	}

	// 구매 목록 보여주기
	public void showPurchasedItems() {
		String[] arr = new String[100];
		arr = getPurchasedItems();
		int idx = getArrayIdx();
		printLine("=======================");
		printNoLine("구매 목록: ");
		for (int i = 0; i < idx; i++ ) {
			printNoLine(arr[i] + "\t");
		}
		printLine();
		// arrayIdx 초기화
		setArrayIdx(0);
	}
	

	// get || set 함수
	public String[] getPurchasedItems() {
		return purchasedItems;
	}
	
	public void setPurchasedItems(String[] purchasedItems) {
		this.purchasedItems = purchasedItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getCustomerMoney() {
		return customerMoney;
	}

	public void setCustomerMoney(int customerMoney) {
		this.customerMoney = customerMoney;
	}

	public int getTotalMoney() {
		return totalMoney;
	}
	
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getItemsOfMachine() {
		return itemsOfMachine;
	}

	public void setItemsOfMachine(String itemsOfMachine) {
		this.itemsOfMachine = itemsOfMachine;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAvailablePayment() {
		return availablePayment;
	}

	public void setAvailablePayment(int availablePayment) {
		if (1 <= availablePayment && availablePayment <= 4) {			
			this.availablePayment = availablePayment;
		} else {
			printLine("1 - 4 중 선택해야 합니다.");
			printLine(" only cash = 1, credit card =2, (cash || credit card) = 3, ( + new payment skills) = 4");
			return;
		}
	}

	public int getBuiltYear() {
		return builtYear;
	}

	public void setBuiltYear(int builtYear) {
		this.builtYear = builtYear;
	}


	public int getInputMoney() {
		return inputMoney;
	}

	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public boolean isRequiredID() {
		return requiredID;
	}

	public void setRequiredID(boolean requiredID) {
		this.requiredID = requiredID;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// get || set 함수 END
	
	// Sysout println(String str) 함수화
	public void printLine (String str) {
		System.out.println(str);
	}
	// Sysout println() 함수화
	public void printLine () {
		System.out.println();
	}
	
	// Sysout print(String str) 함수화
	public void printNoLine (String str) {
		System.out.print(str);
	}
	
	// Sysout println(int a) 함수화
	public void printLine (int a) {
		System.out.println(a);
	}
	
	// Sysout print(int a) 함수화
	public void printNoLine (int a) {
		System.out.print(a);
	}
	
}
