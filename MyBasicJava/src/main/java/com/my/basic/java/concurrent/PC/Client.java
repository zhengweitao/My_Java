package com.my.basic.java.concurrent.PC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		AbstractStorage storage = new Storage3();
		//System.out.println(((Storage3)storage).getList().size());
		Producer p1 = new Producer(storage);
		Producer p2 = new Producer(storage);
		Producer p3 = new Producer(storage);
		Producer p4 = new Producer(storage);
		Producer p5 = new Producer(storage);
		Consumer c1 = new Consumer(storage);
		Consumer c2 = new Consumer(storage);
		Consumer c3 = new Consumer(storage);
		/*new Thread(p1).start();
		new Thread(c1).start();
		new Thread(c2).start();
		new Thread(p2).start();
		new Thread(p3).start();
		new Thread(c3).start();*/
		p1.setNum(5);
		p2.setNum(10);
		p3.setNum(10);
		p4.setNum(5);
		p5.setNum(15);
		c1.setNum(20);
		c2.setNum(15);
		c3.setNum(10);
		ExecutorService es = Executors.newFixedThreadPool(8);
		es.execute(p1);
		es.execute(p2);
		es.execute(p3);
		es.execute(p4);
		es.execute(p5);
		es.execute(c1);
		es.execute(c2);
		es.execute(c3);
		es.shutdown();
	}

}
