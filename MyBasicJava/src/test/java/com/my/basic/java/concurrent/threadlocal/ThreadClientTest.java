package com.my.basic.java.concurrent.threadlocal;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThreadClientTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("********not ThreadLocal************");
		TestNum sn = new TestNum1();  
        // ③ 3个线程共享sn，各自产生序列号  
        ThreadClient t1 = new ThreadClient(sn);  
        ThreadClient t2 = new ThreadClient(sn);  
        ThreadClient t3 = new ThreadClient(sn);  
        t1.start();  
        t2.start();  
        t3.start();  
	}
	@Test
	public void testLocal() {
		System.out.println("********ThreadLocal************");
		TestNum sn = new TestNum2();  
        // ③ 3个线程共享sn，各自产生序列号  
		ThreadClient t1 = new ThreadClient(sn);  
		ThreadClient t2 = new ThreadClient(sn);  
		ThreadClient t3 = new ThreadClient(sn);  
        t1.start();  
        t2.start();  
        t3.start();  
	}
}
