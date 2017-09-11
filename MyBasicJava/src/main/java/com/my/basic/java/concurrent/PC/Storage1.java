package com.my.basic.java.concurrent.PC;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Storage1 extends AbstractStorage{

	private final int MAX_SIZE = 40;
	private List<Object> list = new LinkedList<Object>();
	
	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}
	public void produce(int num){
		synchronized(list){
			try {
				//此处用while，在线程阻塞恢复后，需要再再循环中判断是否满足条件
				while(list.size()+num>MAX_SIZE){
					System.out.println("【需要生产产品】"+num+"【目前已有产品】"+list.size()+"\t暂时无法生产");
					list.wait();
				}
				for (int i = 0; i < num; i++) {
					list.add(new Object());
				}
				System.out.println("【已经生产产品】"+num+"【目前已有产品】"+list.size());
				list.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void consume(int num){
		synchronized(list){
			try {
				if(list.size()<num){
					System.out.println("【需要消费产品】"+num+"【目前已有产品】"+list.size()+"\t暂时无法消费");
					list.wait();
				}else{
					for (int i = 0; i < num; i++) {
						list.remove(0);
					}
				}
				System.out.println("【已经消费产品】"+num+"【目前已有产品】"+list.size());
				list.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
