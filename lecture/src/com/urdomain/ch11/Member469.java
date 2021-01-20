package com.urdomain.ch11;

import java.util.Arrays;

public class Member469 implements Cloneable {
	public String name;
	public int age;
	public int[] scores; // 깊은 복제 대상
	public Car car;  // 깊은 복제 대상
	
	public Member469(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제
		Member469 cloned = (Member469) super.clone(); // Object의 clone() 호출
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); // clone()메소드 재정의
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복재된 Member469 객체를 리턴
		return cloned;
	}
	
	public Member469 getMember() {
		Member469 cloned = null;
		try {
			cloned = (Member469) clone(); // 재정의된 clone() 메서드 호출
		} catch(CloneNotSupportedException e) {
			//
		}
		
		return cloned;
	}
}
