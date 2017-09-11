package com.my.basic.java.basic.staticClass;

public class Outer {
	
	int a = 0;
	public void test1(){
		System.out.println("test1");
	}
	
	public static void test2(){
		System.out.println("test2");
	}
	
	public void test3(){
		a = 3;
		Thread t = new Thread(new Runnable(){
			public void run(){
				System.out.println(a);
			}
		});
		t.start();
	}
	
	public void test4(){
		final int b = 1 ;
		class A{
			public void print(){
				System.out.println(a);
				System.out.println(b);
			}
		}
		a=1;
		A aC = new A();
		aC.print();
	}
	
	public static void main(String[] args) {
//		new Outer().test3();
//		new Outer().test4();
		Outer o = new Outer();
		//inner1 i1 = o.new inner1();
		o.a = 1 ;
		//i1.t3();
		o.test3();
	}
	
	
	class inner1{
		public void t1(){
			test1();
		}
		public void t2(){
			test2();
		}
		
		public void t3(){
			System.out.println(a);
		}
		
		//只有静态内部类才能定义静态方法
		//public static void t3(){}
	}
	
	static class inner2{
		public void t1(){
			//test1();
			test2();
		}
		public static void t2(){
			test2();
		}
	}
	
	
	
}
