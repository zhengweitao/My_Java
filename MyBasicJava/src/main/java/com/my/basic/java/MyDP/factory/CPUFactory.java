package com.my.basic.java.MyDP.factory;

public class CPUFactory {
	
	
	public static CPU createCPU(int type){
		CPU cpu = null ;
		if(type==1){
			cpu = new IntelCPU(755);
		}else if(type==2){
			cpu = new AMDCPU(938);
		}
		return cpu;
	}

}
