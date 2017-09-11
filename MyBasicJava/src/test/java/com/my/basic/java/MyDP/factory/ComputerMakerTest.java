package com.my.basic.java.MyDP.factory;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComputerMakerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		ComputerMaker cm = new ComputerMaker();
		System.out.println("********Factory*********");
		cm.makeComputer(1, 1);
		cm.makeComputer(2, 2);
		System.out.println("********Abstract Factory*********");
		cm.makeComputer2(new IntelComputerFactory());
		cm.makeComputer2(new AMDComputerFactory());
	}

}
