package com.my.basic.java.basic;

import java.util.List;

public class ValueDelivery {
	
	public int doInt(int a){
		a = 100;
		return a ;
	}
	
	public String doString(String s){
		s = "new string";
		return s ;
	}
	
	public Object doObject(Object o){
		o = new Object();
		return o ;
	}
	
	public List<String> doList(List<String> l){
		l.add("new one ");
		return l ;
	}

}
