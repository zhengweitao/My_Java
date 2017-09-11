package com.my.basic.java.MyDP.template;

public class Template extends AbstractTemplate {

	@Override
	protected void step1() {
		System.out.println("Doing step 1 !!!");
	}

	@Override
	protected void step2() {
		System.out.println("Doing step 2 !!!");
	}

	@Override
	protected void step3() {
		System.out.println("Doing step 1 !!!");
	}
	
	protected void hook(){
		System.out.println("doing by common method by Template !!!");
	}
}
