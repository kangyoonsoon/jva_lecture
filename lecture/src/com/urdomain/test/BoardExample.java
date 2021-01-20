package com.urdomain.test;

public class BoardExample {

	public static void main(String[] args) {
		Notices notice = new Notices("제목", "김아무", "aa11", "2021-01-12", 1);
		
		notice.inputArticle(1);
		// 조상메서드
		notice.showBoard();
	}

}
