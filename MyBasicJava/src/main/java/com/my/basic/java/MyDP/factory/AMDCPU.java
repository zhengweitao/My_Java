package com.my.basic.java.MyDP.factory;

public class AMDCPU implements CPU {
	
	private int pins = 0;
	
    public  AMDCPU(int pins){
        this.pins = pins;
    }
    
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("AMD CPU pins ："+ this.pins);
	}


}
