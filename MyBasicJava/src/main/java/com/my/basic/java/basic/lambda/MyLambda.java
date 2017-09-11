package com.my.basic.java.basic.lambda;

@FunctionalInterface
interface ILambda{
	public void print();
}

class Model {
	public static void print(){
		System.out.println("From Model !!!");
	}
}


public class MyLambda {
	public void test(){
		new Thread(() -> System.out.println("hello my lambda")).start();
	}

	public void test2(ILambda lambda){
		lambda.print();
	}

	
	public static void main(String[] args) {
		MyLambda l = new MyLambda();
		//l.test2(() -> System.out.println("hello my lambda"));
		
		ILambda lam = Model::print;
		lam.print();
	}
}
