package com.urdomain.project;

public class SignUp {
	String nickName;
	String character;
	String email;
	String password;
	String name;
	String[] dbId = new String[1000];
	
	
	// 아이디 배열 DB에서 얻기
	public String[] getIdArray(){
		//
		String[] arr = new String[10000];
		return arr; 
	}
	
	// 아이디 중복 체크
	public boolean checkDuplicatedId(String id) {		
		String dbId = ""; // 나중에 고침
		if (character.equals(dbId)) {
			//
			return true;
		} else {
			System.out.println("가입된 아이디가 존재합니다.");
			return false;
		}
	}
	
	// 회원 정보 저장
	public void saveUserProfile(String nickName, String character, String email, String password, String name) {
		this.nickName = nickName;
		this.nickName = character;
		this.nickName = email;
		this.nickName = password;
		this.nickName = name;
		
		// DB에 저장
		// ..
	}
	
	// 선택된 캐릭터 보여주기
	public void showCharacter(String character) {
		// 화면 출력
	}
}
