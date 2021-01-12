package com.urdomain.test;

public class Notices extends BulletinBoard  {
	boolean isEmphasis;

	
	public Notices (String title, String name, String id, String date, boolean isEmphasis) {
		super(title, name, id, date);
		this.isEmphasis = isEmphasis;
	}
	
	public void inputArticle(boolean isEmphasis) {
		if(isEmphasis) {
			//게시글 위치 변경
		}
		
	}

}
