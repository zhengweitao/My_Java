package com.my.basic.java.MyDP.factory;

public class IntelCPU implements CPU {
	
	private int pins = 0;
	
    public  IntelCPU(int pins){
        this.pins = pins;
    }
    
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Intel CPU pins ："+ this.pins);
	}

}
