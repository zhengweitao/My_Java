package com.my.basic.java.concurrent.PC;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractStorage {
	
	public abstract void produce(int num);
	public abstract void consume(int num);
}
