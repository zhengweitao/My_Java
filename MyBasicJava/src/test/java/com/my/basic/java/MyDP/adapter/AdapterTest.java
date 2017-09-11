package com.my.basic.java.MyDP.adapter;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdapterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter();
		adaptee.doOperate();
		adapter.realOperate();
		
		Adapter2 adapter2 = new Adapter2(adaptee);
		adapter2.realOperate();
	}

}
