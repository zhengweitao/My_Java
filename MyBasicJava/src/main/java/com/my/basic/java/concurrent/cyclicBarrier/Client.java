package com.my.basic.java.concurrent.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		/*CyclicBarrier cb = new CyclicBarrier(3);
		ExecutorService es = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			es.execute(new CyclicThread(cb));
		}
		es.shutdown();
*/
		Counter counter = new Counter();
		counter.doCount();
	}

}
