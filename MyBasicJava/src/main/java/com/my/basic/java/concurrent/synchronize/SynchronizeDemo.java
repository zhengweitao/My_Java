package com.my.basic.java.concurrent.synchronize;

public class SynchronizeDemo {
	/**
	 * 如果一个synchronized方法被调用时，所有需要获取这个的对象锁的synchronized（方法，块）都会被阻塞
	 * 如果时synchronized块的化，在结束块之后进行其他逻辑处理前释放锁，可以让其他synchronized提前获取锁进行操作
	 * 
	 * 
	 */
	
	public synchronized void sync1(){
		System.out.println("begin running sync1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end running sync1");
	}
	
	public synchronized void sync2(){
		System.out.println("begin running sync2");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end running sync2");
	}
	
	public void sync3(){
		synchronized(this){
			System.out.println("running sync3");
		}
		try {
			System.out.println("not running sync3");
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
}
