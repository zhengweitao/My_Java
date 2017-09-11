package com.my.basic.java.concurrent.PC;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PCClient {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	public void testSynchronized() {
		AbstractStorage storage = new Storage1();
		
		Producer p1 = new Producer(storage);
		Producer p2 = new Producer(storage);
		Producer p3 = new Producer(storage);
		Producer p4 = new Producer(storage);
		Producer p5 = new Producer(storage);
		Consumer c1 = new Consumer(storage);
		Consumer c2 = new Consumer(storage);
		Consumer c3 = new Consumer(storage);
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
	
	@Test
	public void testLock() {
		AbstractStorage storage = new Storage2();
		
		Producer p1 = new Producer(storage);
		Producer p2 = new Producer(storage);
		Producer p3 = new Producer(storage);
		Producer p4 = new Producer(storage);
		Producer p5 = new Producer(storage);
		Consumer c1 = new Consumer(storage);
		Consumer c2 = new Consumer(storage);
		Consumer c3 = new Consumer(storage);
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
