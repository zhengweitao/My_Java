package com.my.basic.java.concurrent.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncClient {
	
	public static void main(String[] args) {
		SynchronizeDemo sd = new SynchronizeDemo();
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		//es.execute(new SyncThread2(sd));
		es.execute(new SyncThread3(sd));
		es.execute(new SyncThread1(sd));
		es.shutdown();
	}

}
