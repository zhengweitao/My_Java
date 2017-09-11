package com.my.basic.java.basic.myEnum;

public enum WeekDay2 {
	SUNDAY(0),
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6);

	private int value;
	private WeekDay2(int val){
		this.value = val ;
	}
	public String toString(){
		return this.name()+":"+this.ordinal();
	}
	public int getVal(){
		return this.value;
	}

	
	
}
