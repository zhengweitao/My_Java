package com.my.basic.java.MyDP.observer;

public class Student implements Observer {
	
	private String state;

	@Override
	public void update(String state) {
		this.state=state;
		System.out.println("现在的状态是："+this.state);
		if(this.state=="R"){
			System.out.println("考试！");
		}else{
			System.out.println("等成绩！");
		}
		
	}
	

}
