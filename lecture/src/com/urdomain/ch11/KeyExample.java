package com.urdomain.ch11;

import java.util.HashMap;

public class KeyExample {
	/* HashMap의 식별키로 Key 객체를 사용하면 저장된 값을 찾아오지 못한다. 왜냐하면 
	 * number 필드값이 같더라도 hashCode() 메소드에서 리턴하는 해시코드가 다르기 때문에 
	 * 다른 식별키로 인식하기 때문이다.
	 * 재정의한 hashCode() 메소드를 Key클래스에 추가하면 된다.
	 * hashCode()의 리턴값을 number필드값으로 했기 때문에 저장할 때의 new Key(1)과
	 * 읽을 때의 new Key(1)은 같은 해시코드가 리턴된다. 	
	 */
	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)"로 "홍길동"을 정함
		hashMap.put(new Key(1), "홍길동");
		
		// 식별키 "new Key(1)"로 홍길동을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
