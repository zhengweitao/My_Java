package com.my.basic.java.MyDP.prototype;

public class Prototype implements Cloneable{
	
	public Prototype clone(){
		Prototype prototype = null;
		try {
			prototype=(Prototype)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototype;
		
	}

}
