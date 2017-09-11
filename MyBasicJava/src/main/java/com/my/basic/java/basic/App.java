package com.my.basic.java.basic;

import java.io.UnsupportedEncodingException;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//App.testSwitch("abc");
    	//App.testEquals();
//    	App.testReference();
//    	System.out.println(App.testTryCatch());
//    	((App)null).testCastNull();
//    	App.testInterface();
    	App.testAdd();
//    	App.testInteger();
//    	int x = 5_2 ;
//    	App.testSort();
    	//int r = (10<<1)+1;
    	//System.out.println(r);
   /* 	int[] a = new int[10];
    	for (int i = 0; i < a.length; i++) {
    		System.out.println(a[i]);
		}*/
    	
    }
    
    public static void testSort(){
    	Integer[] nums = {5,9,4,1,0,3,7};
    	List<Integer> numList = Arrays.asList(nums);
    	numList.sort(null);
    	for(Integer i : numList){
    		System.out.println(i);
    	}
    	
    	
    	/*Arrays.sort(nums);
    	for (int i = 0; i < nums.length; i++) {
    		System.out.println(nums[i]);
		}*/
    	
    	
    }
    
    public static void testInteger(){
    	Integer a = 300 ;
    	Integer b = 300 ;
    	System.out.println(a==b);
    	System.out.println(a.equals(b));
    }
    
    public static void testAdd(){
    	int a = 127 ;
    	int b = 127 ;
    	System.out.println(a);
    	a = a++;
    	System.out.println(a);
    	b = ++b;
    	System.out.println(b);
    }
    
    public static void testInterface(){
    	InterfaceClass ic = new InterfaceClass();
    	ic.test();
    }
    
    public static void testCastNull(){
    	System.out.println("test cast null to Object");
    }
    
    @SuppressWarnings("finally")
	public static int testTryCatch(){
    	try {
			return 1 ;
		} catch (Exception e) {
			return 2 ;
		}finally {
			return 3;
		}
    }
    
    public static void testReference(){
    	SoftReference<String> sr = new SoftReference<String>("aaa");
    	System.out.println(sr.get());
    	String b = new String("bbb");
//    	String b = "bbb";
    	WeakReference<String> wr = new WeakReference<String>(b);
    	System.out.println(wr.get());
    	ReferenceQueue<String> rq = new ReferenceQueue<String>();
//    	String c = "ccc";
    	String c = new String("ccc");
    	PhantomReference<String> pr = new PhantomReference<String>(c,rq);
    	String s;
    	System.out.println(s = pr.get());
    	//String d = "ddd";
    	b = null;
    	c = null;
    	
    	try {
			rq.remove();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.gc();
    	System.out.println("-------------------");
    	System.out.println(sr.get());
    	System.out.println(wr.get());
    	System.out.println(pr.get());
    }
    
    public static void testEquals(){
    	Object o = new Object();
    	Integer a = 0 ;
    	Integer b = 0 ;
    	System.out.println(a.equals(b));
    }
    
    public static void testSwitch(String con){
    	switch(con){
    	case "abc": System.out.println(con);break;
    	default: System.out.println("no in case !!!");
    	}
    		
    }
    
    public static void testCode(){
    	  String s = "aaaa";
          try {
  			String s2 = new String(s.getBytes("GBK"),"UTF-8");
  		} catch (UnsupportedEncodingException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    }
    
}
