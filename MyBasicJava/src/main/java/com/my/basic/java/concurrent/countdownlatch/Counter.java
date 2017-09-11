package com.my.basic.java.concurrent.countdownlatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter {
	
	public static final int N = 5;
	List<Integer> count = Collections.synchronizedList(new ArrayList<>());
	CountDownLatch cl1 ;
	CountDownLatch cl2 ;
	class SubCounter implements Runnable{
		
		@Override
		public void run() {
			Random random = new Random();
			Integer n = random.nextInt();
			System.out.println("单个数："+n);
			count.add(n);
			try {
				cl1.await();
				cl2.countDown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		
	}
	
	class TotalCounter implements Runnable{

		@Override
		public void run() {
			try {
				cl2.await();
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
		cl1 = new CountDownLatch(1);
		cl2 = new CountDownLatch(N);
		ExecutorService es = Executors.newFixedThreadPool(N);
		for (int i = 0; i < N; i++) {
			es.execute(new SubCounter());
		}
		es.execute(new TotalCounter());
		cl1.countDown();
		es.shutdown();
	}
	
	
	
}
