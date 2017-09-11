package com.my.basic.java.MyDP.strategy;

public class User {
	
	private AbstractStrategy strategy ;
	public User(AbstractStrategy strategy){
		this.strategy = strategy;
	}
	public void useStrategy(){
		this.strategy.doStrategy();
	}

}
