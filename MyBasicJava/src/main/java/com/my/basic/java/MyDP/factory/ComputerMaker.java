package com.my.basic.java.MyDP.factory;

public class ComputerMaker {
	
	private CPU cpu ;
	private MainBoard mainBoard;
	
	public void makeComputer(int cpuType,int mainBoardType){
		this.cpu = CPUFactory.createCPU(cpuType);
		this.mainBoard = MainBoardFactory.createMainBoard(mainBoardType);
		this.cpu.calculate();
		this.mainBoard.installCPU();
		
	}
	
	
	public void makeComputer2(AbstractComputerFactory factory){
		this.cpu = factory.createCPU();
		this.mainBoard = factory.createMainBoard();
		this.cpu.calculate();
		this.mainBoard.installCPU();
	}

}
