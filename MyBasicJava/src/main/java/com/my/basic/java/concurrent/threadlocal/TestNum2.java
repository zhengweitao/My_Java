package com.my.basic.java.concurrent.threadlocal;

public class TestNum2 implements TestNum{
	private ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	public int getNextNum(){
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}

}
