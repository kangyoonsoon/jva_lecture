package com.urdomain.ch11;
//??? 와닿지 않네..과연 쓸 수 있나???

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
//			Class clazz = Class.forName("com.urdomain.ch11.SendAction");
			Class clazz = Class.forName("com.urdomain.ch11.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
	