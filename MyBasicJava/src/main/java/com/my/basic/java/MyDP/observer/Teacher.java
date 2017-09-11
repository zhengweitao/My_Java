package com.my.basic.java.MyDP.observer;

public class Teacher implements Observer {

	private String state;

	@Override
	public void update(String state) {
		this.state=state;
		System.out.println("现在的状态是："+this.state);
		if(this.state=="D"){
			System.out.println("批卷！");
		}else{
			System.out.println("监考！");
		}
		
	}
	

}
