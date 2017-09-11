package com.my.basic.java.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	private void loopList(List<Integer> list) {
		long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
        {
            list.get(i);
        }
        System.out.println(list.getClass().getSimpleName() + "使用普通for循环遍历时间为" + 
                (System.currentTimeMillis() - startTime) + "ms");
         
        startTime = System.currentTimeMillis();
        for (Integer i : list)
        {
             
        }
        System.out.println(list.getClass().getSimpleName() + "使用foreach循环遍历时间为" + 
                (System.currentTimeMillis() - startTime) + "ms");
	}
	
	
	@Test
	public void test() {
		List<Integer> arrayList = new ArrayList<Integer>(100000);
        List<Integer> linkedList = new LinkedList<Integer>();
         
        for (int i = 0; i < 100000; i++)
        {
            arrayList.add(i);
            linkedList.add(i);
        }
         
        loopList(arrayList);
        loopList(linkedList);
        System.out.println();
	}
}
