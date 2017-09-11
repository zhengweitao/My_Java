package com.my.basic.java.MyDP.factory;

public class MainBoardFactory {
	public static MainBoard createMainBoard(int type){
		MainBoard mainBoard = null ;
		if(type==1){
			mainBoard = new IntelMainBoard(755);
		}else if(type==2){
			mainBoard = new AMDMainBoard(938);
		}
		return mainBoard;
	}

}
