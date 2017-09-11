package com.my.basic.java.MyDP.builder;

public class Director {
	
	private Builder builder ;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void build(){
		this.builder.buildPart1();
		this.builder.buildPart2();
		Product product = this.builder.getProduct();
		System.out.println(product.getId());
		System.out.println(product.getName());
	}

}
