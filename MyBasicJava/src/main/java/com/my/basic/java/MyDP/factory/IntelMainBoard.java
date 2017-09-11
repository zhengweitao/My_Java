package com.my.basic.java.MyDP.factory;

public class IntelMainBoard implements MainBoard {
	private int cpuHoles = 0;
    public IntelMainBoard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
	
	
	@Override
	public void installCPU() {
		System.out.println("Intel MainBoard cpuHoles:"+cpuHoles);
	}

}
