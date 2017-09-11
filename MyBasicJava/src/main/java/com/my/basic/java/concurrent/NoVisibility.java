package com.my.basic.java.concurrent;

public class NoVisibility {
	private static boolean ready;
	private static int num;
	
	private static class ReadThread extends Thread{
		public void run(){
			while(!ready){
				//System.out.println(ready);
				Thread.yield();
			}
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		new ReadThread().start();
		num=100;
		ready=true;
	}

}
