package com.urdomain.test;

public class BulletinBoard extends Board {
	String title;
	String name;
	String id;
	String date;
	String images;
	int views;
	
	public BulletinBoard (String title, String name, String id, String date) {
		this.title = title;
		this.name = name;
		this.id = id;
		this.date = date;
	}
	
	public void inputArticle(int num) {
		System.out.println("게시판에 글을 썼습니다.~");
	}
	
	public void getIdprofile(String id) {
		
	}
}
