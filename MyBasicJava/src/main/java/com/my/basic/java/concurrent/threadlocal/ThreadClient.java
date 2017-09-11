package com.my.basic.java.concurrent.threadlocal;

public class ThreadClient extends Thread{
	private TestNum num ;
	
	public ThreadClient(TestNum num){
		this.num = num;
	}
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn["  
                    + num.getNextNum() + "]"); 
		}
	}

}
