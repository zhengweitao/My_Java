package com.my.basic.java.basic.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.my.basic.java.basic.generics.genericsDemo;

public class genericsDemoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		genericsDemo d = new genericsDemo();
		d.test();
		d.test2();
		List<Map> l = new ArrayList<>();
		Map<String,String> p = new HashMap<>();
		p.put("good", "good");
		//d.test3(l);
	}

}
