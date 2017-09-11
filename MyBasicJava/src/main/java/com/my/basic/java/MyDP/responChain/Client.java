package com.my.basic.java.MyDP.responChain;

public class Client {

	public static void main(String[] args) {
		AbstractHandler handler = new FirstHandler();
		handler.setNextHandler(new SecondHandler());
		handler.handlerRequest();
	}

}
