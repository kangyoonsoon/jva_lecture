package com.urdomain.ch07;

public class Child325Example {

	public static void main(String[] args) {
		Parent325 parent = new Child325();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2";  //불가능
		 parent.method3();  //불가능
		 * */
		
		Child325 child = (Child325) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
	