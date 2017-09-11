package com.my.basic.java.MyDP.builder;

public class ConcreteBuilder implements Builder {
	
	private Product prodcut = new Product();

	@Override
	public void buildPart1() {
		this.prodcut.setId("9527");
	}

	@Override
	public void buildPart2() {
		this.prodcut.setName("华安");
	}

	@Override
	public Product getProduct() {
		return this.prodcut;
	}

}
