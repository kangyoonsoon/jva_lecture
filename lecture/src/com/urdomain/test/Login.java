package com.urdomain.test;

public class Login {
	public static void main(String[] args) {
		String[] user = { "kang1234", "1111" };  // db
		
		String id = "kang1234";
		String password = "1111";
		
		if (id.equals(user[0]) && password.equals(user[1])) {
			System.out.println("Login Success!");
		} else {
			System.out.println("Login Failure!");
		}
	}
}
