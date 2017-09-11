package com.my.basic.java.MyDP.factory;

public class IntelComputerFactory implements AbstractComputerFactory{

	@Override
	public CPU createCPU() {
		return new IntelCPU(755);
	}

	@Override
	public MainBoard createMainBoard() {
		return new IntelMainBoard(755);
	}

}
