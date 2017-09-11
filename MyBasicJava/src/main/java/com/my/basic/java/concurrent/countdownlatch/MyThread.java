package com.my.basic.java.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
	
	private String name ;
	private CountDownLatch latch ;
	
	public MyThread(String name,CountDownLatch latch){
		this.name = name;
		this.latch = latch;
	}
	
	@Override
	public void run() {
		
		try {
			latch.await();
			Thread.sleep((long)Math.random()*100);
			System.out.println("执行线程："+name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
