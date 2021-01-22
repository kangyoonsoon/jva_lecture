package com.urdomain.ch11;

import java.util.Arrays;

// Arrays.sort()를 먼저 실행해야 한다. 그렇지 않으면 인덱스 값은 -4로 이상하게 나온다.

public class SearchExample {

	public static void main(String[] args) {
		// 기본 타입값 검색
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인데스: " + index);

		// 문자열 검색
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: " + index);
		
		// 객체 검색
		Member524 m1 = new Member524("홍길동");
		Member524 m2 = new Member524("박동수");
		Member524 m3 = new Member524("김민수");
		Member524[] members = { m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
		
	}

}
