package com.urdomain.ch11;

public class Member524 implements Comparable<Member524>{

	String name;
	
	Member524(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Member524 o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
