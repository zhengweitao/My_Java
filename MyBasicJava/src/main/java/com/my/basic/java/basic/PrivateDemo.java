package com.my.basic.java.basic;

public class PrivateDemo {
	
	private void myPrivate(){
		System.out.println("测试私有方法！！！");
	}
	
	public void usePrivate(){
		this.myPrivate();
	}
	
	public static void myStatic(){
		System.out.println("测试静态方法！！！");
	}
}
