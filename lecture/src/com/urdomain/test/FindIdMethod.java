package com.urdomain.test;

public class FindIdMethod {

	String[] user = {"Alex123", "Alex0001@amail.com", "Alex"}; // db

	public static void main(String[] args) {	
		FindIdMethod fm= new FindIdMethod();
		fm.evaluateEmail("Alex0001@amail.com", "Alex");
	}
	
	public void evaluateEmail(String email, String name) {
		FindId findId = new FindId();
		if (email.equals(user[1]) && name.equals(user[2])) {	
			System.out.println("아이디: " + findId.makeAsteriskInName(user[0]));
			System.out.println("이메일: " + user[1]);
			System.out.println("이름: " + user[2]);
		} else {
			System.out.println( "찾을 수 없습니다." );
		}
		
	}

}
