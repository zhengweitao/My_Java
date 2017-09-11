package com.my.basic.java.basic.myEnum;

import java.util.Collections;

public class Client {

	
	public static void main(String[] args) {
	/*	WeekDay[] days = WeekDay.values();
		for(WeekDay d: days){
			System.out.println(d.name()+"--"+d.ordinal());
		}
		*/
		
		WeekDay2[] days = WeekDay2.values();
		System.out.println(WeekDay2.SUNDAY);
		for(WeekDay2 d: days){
			System.out.println(d.toString()+"--"+d.getVal());
		}
	}
}
