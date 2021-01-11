package com.urdomain.ch07;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);  //반드시 맨 첫 줄에 위치해야 함
		this.studentNo = studentNo;
	}
}
