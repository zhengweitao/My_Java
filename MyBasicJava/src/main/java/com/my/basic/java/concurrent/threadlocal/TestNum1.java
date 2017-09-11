package com.my.basic.java.concurrent.threadlocal;

public class TestNum1 implements TestNum{
	private Integer seqNum = 0;
	public int getNextNum(){
		seqNum = seqNum.intValue()+1;
		return seqNum.intValue();
	}

}
