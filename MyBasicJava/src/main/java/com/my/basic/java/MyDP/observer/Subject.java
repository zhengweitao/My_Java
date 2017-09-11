package com.my.basic.java.MyDP.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public abstract void changeState(String state);
	
	public void addOb(Observer ob){
		System.out.println("增加一个观察者！");
		observers.add(ob);
	}
	
	public void delOb(Observer ob){
		System.out.println("减少一个观察者！");
		observers.remove(ob);
	}
	
	public void notifyOb(String state){
		for(Observer ob:observers){
			ob.update(state);
		}
	}
	
}
