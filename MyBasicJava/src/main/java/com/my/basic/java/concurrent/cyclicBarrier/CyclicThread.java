package com.my.basic.java.concurrent.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicThread implements Runnable {
	private CyclicBarrier cb;
	
	public CyclicThread(CyclicBarrier cb){
		this.cb = cb;
	}
	@Override
	public void run() {
		double a = Math.random()*100;
		System.out.println(a+"--"+System.currentTimeMillis());
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a+"--"+System.currentTimeMillis());
	}

}
