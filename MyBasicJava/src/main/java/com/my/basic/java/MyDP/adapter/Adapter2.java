package com.my.basic.java.MyDP.adapter;

public class Adapter2 {
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	
	public void realOperate(){
		this.adaptee.doOperate();
	}

}
