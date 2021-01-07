package com.urdomain.test;

public class Customer {
	int myMoney = 10000;
	
	Customer(int money){
		this.myMoney = money;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public String toString() {
		return   "Customer's money: " + myMoney + "원" + "\n";
	}
	
}
