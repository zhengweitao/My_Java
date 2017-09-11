package com.my.basic.java.basic.reflect;

public interface DemoInterface {
	
	public static String str = "test_interface";
	
	public void testI1();
	
	default void  defaultMethod(){
		System.out.println("default");
	}

}
