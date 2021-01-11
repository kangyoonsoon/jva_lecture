package com.urdomain.test;

public class LoginMethod {
	String[] user = { "kang1234", "1111" };  // db

	public static void main(String[] args) {
		LoginMethod lm = new LoginMethod();
		
		String id = "kang1234";
		String password = "1111";
		
		lm.evaluateLogin(id, password);
	}
	
	public void evaluateLogin(String id, String password) {
		if (id.equals(user[0]) && password.equals(user[1])) {
			System.out.println("Login Success!");
		} else {
			System.out.println("Login Failure!");
		}
	}
}
