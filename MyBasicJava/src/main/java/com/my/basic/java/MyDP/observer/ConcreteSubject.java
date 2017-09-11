package com.my.basic.java.MyDP.observer;

public class ConcreteSubject extends Subject {
	
	private String state ;
	
	public void changeState(String newState){
		this.state = newState;
		this.notifyOb(state);
	}

}
