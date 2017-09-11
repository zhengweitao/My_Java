package com.my.basic.java.concurrent.PC;

import java.util.concurrent.LinkedBlockingQueue;

public class Storage3 extends AbstractStorage{

	private final int MAX_SIZE = 40;
	private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<Object>(MAX_SIZE);
	
	public LinkedBlockingQueue<Object> getList() {
		return list;
	}

	public void setList(LinkedBlockingQueue<Object> list) {
		this.list = list;
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}
	public void produce(int num){
			try {
				if(list.size()==MAX_SIZE){
					System.out.println("【目前已有产品】"+list.size()+"\t暂时无法生产");
				}
					//System.out.println("testing");
				for (int i = 0; i < num; i++) {
					list.put(new Object());
				}
				System.out.println("【目前已有产品】"+list.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
			}
	}
	
	public void consume(int num){
			try {
				if(list.size()==0){
					System.out.println("【目前已有产品】0\t暂时无法消费");
				}
				for (int i = 0; i < num; i++) {
					list.take();
				}
				System.out.println("【目前已有产品】"+list.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
			}
	}

}
