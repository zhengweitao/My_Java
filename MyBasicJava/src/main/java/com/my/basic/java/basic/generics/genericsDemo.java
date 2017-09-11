package com.my.basic.java.basic.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class genericsDemo {
	
	public <T> T get(T t){
		
		return t ;
	}
	
	public <T> T staticGet(T t){
		return t ;
	}
	
	public <T> List<T> getList(List<T> l){
		return l;
	}
	
	public <T> List<T> staticGetList(List<T> l){
		return l;
	}
	
	
	
	class classG1<T>{
		private T a ;
		public classG1(T a){
			this.a = a ;
		}
		public void print(){
			System.out.println(a.toString());
		}
	}
	
	public void test(){
		classG1<String> c = new classG1<>("ddd");
		c.print();
		ArrayList<String> l = new ArrayList<>();
		l.add("aaa");
		classG1<ArrayList> c1 = new classG1<>(l);
		c1.print();
	}
	
	public void test2(){
		List<String> l = new ArrayList<>();
		l.add("bbb");
		classG2<List> c = new classG2<>(l);
		c.print();
	}
	
	public void test3(List<? extends Map> l){
		System.out.println(l.get(0));
	}
	
	
	class classG2<T extends List>{
		private T a ;
		public classG2(T a){
			this.a = a ;
		}
		public void print(){
			System.out.println(a.size());
		}
	}
	
	public static void main(String[] args) {
		genericsDemo d = new genericsDemo();
		d.test();
		d.test2();
		ArrayList<Map> l = new ArrayList<>();
		Map<String,String> p = new HashMap<>();
		p.put("good", "good");
		l.add(p);
		d.test3(l);
	}
}
