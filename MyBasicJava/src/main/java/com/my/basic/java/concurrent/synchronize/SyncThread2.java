package com.my.basic.java.concurrent.synchronize;

public class SyncThread2 implements Runnable{
	
	private SynchronizeDemo sd ;
	
	public SyncThread2(SynchronizeDemo sd){
		this.sd = sd ;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			sd.sync2();
		}
	}

	
}
