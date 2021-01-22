package com.urdomain.ch11;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name = "신용권";
		String tel = "010-123-1234";
		
		String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0}, {1}, {2});";
		// String[]도 괜찮네?
		//		Object[] arguments = {"자바", "신용남", "010-345-3245"};
		String[] arguments = {"자바", "신용남", "010-345-3245"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}

}
