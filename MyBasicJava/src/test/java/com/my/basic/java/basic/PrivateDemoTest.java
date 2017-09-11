package com.my.basic.java.basic;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.my.basic.java.basic.PrivateDemo;
import com.my.basic.java.basic.SubPrivateDemo;


public class PrivateDemoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		/*PrivateDemo pd = new PrivateDemo();
		pd.usePrivate();*/
		/*SubPrivateDemo spd = new SubPrivateDemo();
		spd.usePrivate();
		spd.myStatic();*/
		PrivateDemo.myStatic();
		SubPrivateDemo.myStatic();
	}

}
