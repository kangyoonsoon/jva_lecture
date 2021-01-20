package com.urdomain.ch11;

public class Member467 implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member467(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member467 getMember() {
		Member467 cloned = null;
		
		try {
			cloned = (Member467) clone(); // clone() 메소드의 리턴 타입은 Object이므로 Member467타입으로 캐스팅해야 한다.
		} catch(CloneNotSupportedException e) {
			//	
		}
		return cloned;
	}
}
