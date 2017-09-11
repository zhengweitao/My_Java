package com.my.basic.java.basic;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PolymorphicTest {
	
	class A {  
	    public String show(D obj){  
	           return ("A and D");  
	    }   
	    public String show(A obj){  
	           return ("A and A");  
	    }   
	}   
	class B extends A{  
	    public String show(B obj){  
	           return ("B and B");  
	    }  
	    public String show(A obj){  
	           return ("B and A");  
	    }   
	}  
	class C extends B{}   
	class D extends B{} 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		A a1 = new A();  
        A a2 = new B();  
        B b = new B();  
        C c = new C();   
        D d = new D();   
        System.out.println(a1.show(b));     //use A.show(A obj)
        System.out.println(a1.show(c));     //use A.show(A obj)
        System.out.println(a1.show(d));     //use A.show(D obj)
        System.out.println(a2.show(b));     //use B.show(A obj)
        System.out.println(a2.show(c));     //use B.show(A obj)
        System.out.println(a2.show(d));     //use A.show(D obj)
        System.out.println(b.show(b));      //use B.show(B obj)
        System.out.println(b.show(c));      //use B.show(B obj)
        System.out.println(b.show(d));      //use A.show(D obj)
	}

}
