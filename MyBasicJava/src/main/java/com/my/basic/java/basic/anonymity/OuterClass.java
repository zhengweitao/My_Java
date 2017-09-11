package com.my.basic.java.basic.anonymity;

public class OuterClass {
	
	public void testAnony(){
		//此处的num作为参数传入匿名内部类，必须定义称final，可以不添加final关键字，但是必须保证该变量不会发生变化
		int num = 100 ;
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(num);
			}
			
		});
	//	num = 101 ; 
		t.start();
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.testAnony();
	}
}
