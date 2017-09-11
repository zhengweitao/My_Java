package com.my.basic.java.basic;

public interface MyInterface {
	String str = "aaa";
	default void test(){
		System.out.println("接口中的默认方法！！！");
	}

}
