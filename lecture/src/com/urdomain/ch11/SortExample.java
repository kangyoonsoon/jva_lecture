package com.urdomain.ch11;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		};
		System.out.println();
		
		Member524 m1 = new Member524("홍길동");
		Member524 m2 = new Member524("박동수");
		Member524 m3 = new Member524("김민수");
		
		Member524[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for(int i = 0; i< members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i]);
		}
		
	}

}
