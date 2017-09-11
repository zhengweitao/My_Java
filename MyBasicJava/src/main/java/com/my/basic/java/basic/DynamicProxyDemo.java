package com.my.basic.java.basic;

public class DynamicProxyDemo implements DynamicProxyInterface{

	public void doSomething() {
		System.out.println("Do something in DynamicProxyDemo !");
		
	}

	public void doOthers(String args) {
		System.out.println("Do "+args+" in DynamicProxyDemo !");
		
	}
	
	
}
