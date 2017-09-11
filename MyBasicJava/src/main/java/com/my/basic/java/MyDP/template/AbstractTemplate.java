package com.my.basic.java.MyDP.template;

public abstract class AbstractTemplate {
	
	public void doOperate(){
		this.hook();
		this.step1();
		this.step2();
		this.step3();
		this.finish();
	}
	
	
	protected abstract void step1();
	protected abstract void step2();
	protected abstract void step3();

	
	protected void hook(){
		System.out.println("doing by common method by abstract !!!");
	}
	
	protected void finish(){
		System.out.println("finishing !!!");
	}
}
