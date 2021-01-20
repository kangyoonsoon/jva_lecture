package com.urdomain.test;

public class Notices extends BulletinBoard  {
	int emphasis;

	
	public Notices (String title, String name, String id, String date, int emphasis) {
		super(title, name, id, date);
		this.emphasis = emphasis;
	}
	
	@Override
	public void inputArticle(int num) {
	
		if(num == 1) {
			System.out.println("공지사항을 썼습니다.");
		} else {
			super.inputArticle(2);
		}
		
	}

}
