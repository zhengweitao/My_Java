package com.my.basic.java.MyDP.responChain;

public abstract class AbstractHandler implements Handler {
	protected AbstractHandler nextHandler ;
	
	public AbstractHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract void handlerRequest();
	
	

}
