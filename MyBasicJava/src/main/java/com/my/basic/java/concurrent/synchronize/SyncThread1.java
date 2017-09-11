package com.my.basic.java.concurrent.synchronize;

public class SyncThread1 implements Runnable{
	
	private SynchronizeDemo sd ;
	
	public SyncThread1(SynchronizeDemo sd){
		this.sd = sd ;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			sd.sync1();
		}
	}

	
}
