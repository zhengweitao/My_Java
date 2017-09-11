package com.my.basic.java.basic;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.my.basic.java.basic.DynamicProxyDemo;
import com.my.basic.java.basic.DynamicProxyHandler;
import com.my.basic.java.basic.DynamicProxyInterface;

public class DynamicProxyTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		DynamicProxyInterface dp = new DynamicProxyDemo();
		dp.doSomething();
		dp.doOthers("static");
	}
	
	@Test
	public void testDynamic(){
		DynamicProxyInterface proxy = (DynamicProxyInterface)Proxy.newProxyInstance(DynamicProxyInterface.class.getClassLoader(),
				new Class[]{DynamicProxyInterface.class},  new DynamicProxyHandler(new DynamicProxyDemo()));
		
		proxy.doSomething();
		proxy.doOthers("dynamic");
	}
	
}
