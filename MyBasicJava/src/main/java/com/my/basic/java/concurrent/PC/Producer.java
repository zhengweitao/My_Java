package com.my.basic.java.concurrent.PC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
	
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
	
	public Producer(AbstractStorage storage){
		this.storage = storage;
	}
	private void produce(int num){
		storage.produce(num);
	}
	
	
	@Override
	public void run() {
		this.produce(num);
	}

}
