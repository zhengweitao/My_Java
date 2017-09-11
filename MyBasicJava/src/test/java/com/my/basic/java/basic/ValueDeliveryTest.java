package com.my.basic.java.basic;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.my.basic.java.basic.ValueDelivery;

public class ValueDeliveryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		int a = 0 ;
		String s = "old string";
		Object o = new Object();
		List<String> l = new ArrayList<String>();
		l.add("first one");
		System.out.println("before:"+a);
		System.out.println("before:"+s);
		System.out.println("before:"+o);
		System.out.println("before:"+l.size());
		ValueDelivery vd = new ValueDelivery();
		System.out.println("return:"+vd.doInt(a));
		System.out.println("return:"+vd.doString(s));
		System.out.println("return:"+vd.doObject(o));
		System.out.println("return:"+vd.doList(l).size());
		System.out.println("after:"+a);
		System.out.println("after:"+s);
		System.out.println("after:"+o);
		System.out.println("after:"+l.size());
		
		
	}

}
