package com.urdomain.ch11;

import java.util.HashMap;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)"로 "홍길동"을 정함
		hashMap.put(new Key(1), "blue");
		hashMap.put(new Key(2), "blue");
		hashMap.put(new Key(3), "red");
		
		// 식별키 "new Key(1)"로 홍길동을 읽어옴
		String value1 = hashMap.get(new Key(1));
		String value2 = hashMap.get(new Key(2));
		String value3 = hashMap.get(new Key(3));
		
		if(value1.equals(value2)) {
			System.out.println("value1과 value2는 동등합니다.");
		} else {
			System.out.println("value1과 value2는 동등하지 않습니다.");
		}
		
		if(value1.equals(value3)) {
			System.out.println("value1과 value3는 동등합니다.");
		} else {
			System.out.println("value1과 value3는 동등하지 않습니다.");
		}
		
	}

}
