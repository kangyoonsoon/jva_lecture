package com.urdomain.test;

public class FindId {

	public static void main(String[] args) {
		
		String[] user = {"Alex123", "Alex0001@amail.com", "Alex"}; // db 
		
		// Alex0001@amail.com
		String inputEmail = "Alex0001@amail.com";
		FindId findId = new FindId();
	
		
		if (inputEmail.equals(user[1])) {	
			System.out.println("아이디: " + findId.makeAsteriskInName(user[0]));
			System.out.println("이메일: " + user[1]);
			System.out.println("이름: " + user[2]);
		} else {
			System.out.println( "찾을 수 없습니다." );
		}
	}
	
	public String makeAsteriskInName (String name) {
		String changedName = "";
		char[] cName = new char[name.length()];
		
		for (int i = 0; i < name.length(); i++) {
			cName[i] = name.charAt(i);			
		}
		
		
		
		// 이름 5 - 9
		if ( name.length() >= 5 && name.length() < 10 ) {
			for ( int i = 0; i < name.length(); i++ ) {
				if ((cName.length / 2) - 1 <= i  && i < (cName.length / 2) + 1) {
					cName[i] = '*'; 
				} else {
					// 가운데 자리에 *를 넣고자 했습니다. 그래서 length /2
				}
			}			
		} else if ( name.length() >= 10 ) { 
			for (int i = 0; i < name.length(); i++) {
				if ((cName.length / 2) - 2 <= i  && i < (cName.length / 2) + 2) {
					cName[i] = '*'; 
				} else {
		
				}
			}
		} else if ( name.length() < 5 ) { 
			for (int i = 0; i < name.length(); i++) {
				if ((cName.length / 2) - 1 <= i  && i < (cName.length / 2) + 1) {
					cName[i] = '*'; 
				} else {
					//
				}
			}
		} else {
			
		}
		
		for (char c: cName) {
			changedName += c;
		}
		
		return changedName;
	}


}
