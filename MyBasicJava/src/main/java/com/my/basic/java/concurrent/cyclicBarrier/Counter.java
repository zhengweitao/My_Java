package com.my.basic.java.concurrent.cyclicBarrier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter {
	
	public static final int N = 5;
	List<Integer> count = Collections.synchronizedList(new ArrayList<>());
	CyclicBarrier cb ;
	class SubCounter implements Runnable{
		
		@Override
		public void run() {
			Random random = new Random();
			Integer n = random.nextInt();
			System.out.println("单个数："+n);
			count.add(n);
			try {
				cb.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	class TotalCounter implements Runnable{

		@Override
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int sum = 0;
			for(Integer n:count){
				sum+=n;
			}
			System.out.println("总数："+sum);
			
		}
		
	}
	
	public void doCount(){
		cb = new CyclicBarrier(N,new TotalCounter());
		ExecutorService es = Executors.newFixedThreadPool(N);
		for (int i = 0; i < N; i++) {
			es.execute(new SubCounter());
		}
		es.shutdown();
	}
	
	
	
}
