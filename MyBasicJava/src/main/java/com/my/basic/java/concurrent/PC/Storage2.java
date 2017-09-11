package com.my.basic.java.concurrent.PC;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage2 extends AbstractStorage{

	private final int MAX_SIZE = 40;
	private List<Object> list = new LinkedList<Object>();
	private final Lock lock = new ReentrantLock();
	private final Condition full = lock.newCondition();
	private final Condition empty = lock.newCondition();
	
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
			lock.lock();
			try {
				while(list.size()+num>MAX_SIZE){
					System.out.println("【需要生产产品】"+num+"【目前已有产品】"+list.size()+"\t暂时无法生产");
					full.await();
				}

				for (int i = 0; i < num; i++) {
					list.add(new Object());
				}
				System.out.println("【已经生产产品】"+num+"【目前已有产品】"+list.size());
				full.signalAll();
				empty.signalAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
	}
	
	public void consume(int num){
			lock.lock();
			try {
				while(list.size()<num){
					System.out.println("【需要消费产品】"+num+"【目前已有产品】"+list.size()+"\t暂时无法消费");
					empty.await();
				}
				for (int i = 0; i < num; i++) {
					list.remove(0);
				}
				System.out.println("【已经消费产品】"+num+"【目前已有产品】"+list.size());
				empty.signalAll();
				full.signalAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
	}

}
