package com.my.basic.java.MyDP.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new ConcreteSubject();
		Observer teacher = new Teacher();
		Observer student = new Student();
		subject.addOb(teacher);
		subject.addOb(student);
		
		subject.changeState("R");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		subject.changeState("D");
		
	}

}
