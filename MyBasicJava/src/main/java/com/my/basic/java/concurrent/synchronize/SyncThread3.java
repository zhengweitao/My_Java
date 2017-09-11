package com.my.basic.java.concurrent.synchronize;

public class SyncThread3 implements Runnable{
	
	private SynchronizeDemo sd ;
	
	public SyncThread3(SynchronizeDemo sd){
		this.sd = sd ;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			sd.sync3();
		}
	}

	
}
