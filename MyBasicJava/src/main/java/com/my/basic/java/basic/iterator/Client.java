package com.my.basic.java.basic.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Client {
	
	private final static int SIZE = 1000; 
	
	public static void testFor(List<Object> list){
		System.out.println("list size:"+list.size());
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
	}
	
	public static void testForEach(List<Object> list){
		System.out.println("list size:"+list.size());
		for(Object o:list){
		}
	}

	public static void testIterator(List<Object> list){
		System.out.println("list size:"+list.size());
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			iter.next();
		}
	}
	
	public static void main(String[] args) {
		List<Object> list = new LinkedList<Object>();
		for (int i = 0; i < SIZE; i++) {
			list.add(new Object());
		}
		long start = System.currentTimeMillis();
		Client.testFor(list);
		System.out.println("for:"+(System.currentTimeMillis()-start));
		start = System.currentTimeMillis();
		Client.testForEach(list);
		System.out.println("foreach:"+(System.currentTimeMillis()-start));
		start = System.currentTimeMillis();
		Client.testIterator(list);
		System.out.println("iterator:"+(System.currentTimeMillis()-start));
	}
	
	
	
	
	

}
