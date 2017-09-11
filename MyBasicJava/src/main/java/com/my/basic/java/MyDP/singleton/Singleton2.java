package com.my.basic.java.MyDP.singleton;

public class Singleton2 {
	private Singleton2(){}
	
	private static class SingletonHolder{
		private static Singleton2 instance = new Singleton2();
	}
	
	public static Singleton2 getInstance(){
		return SingletonHolder.instance;
	}
}
