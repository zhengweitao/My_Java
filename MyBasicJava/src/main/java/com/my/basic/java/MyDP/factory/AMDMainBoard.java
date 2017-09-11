package com.my.basic.java.MyDP.factory;

public class AMDMainBoard implements MainBoard {
	private int cpuHoles = 0;
    public AMDMainBoard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
	
	@Override
	public void installCPU() {
		System.out.println("AMD MainBoard cpuHoles:"+cpuHoles);
	}

}
