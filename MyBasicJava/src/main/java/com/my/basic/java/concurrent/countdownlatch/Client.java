package com.my.basic.java.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.my.basic.java.concurrent.cyclicBarrier.Counter;

public class Client {

	public static void main(String[] args) {
		
	/*	CountDownLatch latch = new CountDownLatch(1);
		ExecutorService es = Executors.newFixedThreadPool(5);
		MyThread[] arrs = new MyThread[5];
		for (int i = 0; i < 5; i++) {
			arrs[i] = new MyThread("Thread_"+i, latch);
		}
		
		for (MyThread myThread : arrs) {
			es.execute(myThread);
		}
		System.out.println("所以线程同时开始！！！");
		latch.countDown();
		es.shutdown();*/
		
		Counter counter = new Counter();
		counter.doCount();
		
	}

}
