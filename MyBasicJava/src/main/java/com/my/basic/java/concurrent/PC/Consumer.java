package com.my.basic.java.concurrent.PC;

import java.util.List;

public class Consumer implements Runnable {
	private int num ;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public AbstractStorage getStorage() {
		return storage;
	}
	public void setStorage(AbstractStorage storage) {
		this.storage = storage;
	}


	private AbstractStorage storage;
	
	public Consumer(AbstractStorage storage){
		this.storage = storage;
	}
	private void consume(int num){
		storage.consume(num);
	}
	
	
	@Override
	public void run() {
		this.consume(num);
	}

}
