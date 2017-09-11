package com.my.basic.java.MyDP.factory;

public class AMDComputerFactory implements AbstractComputerFactory {

	@Override
	public CPU createCPU() {
		return new AMDCPU(938);
	}

	@Override
	public MainBoard createMainBoard() {
		return new AMDMainBoard(938);
	}


}
