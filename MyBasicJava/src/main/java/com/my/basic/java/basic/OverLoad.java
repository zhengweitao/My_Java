package com.my.basic.java.basic;



/**
 * 
 * 测试重载的各种写法
 * @author victor
 *
 */
public class OverLoad {
	
	
	public void test(){}
	
	//如果返回值不同，方法名和参数相同，是无法重载方法的
	//public String test(){}
	
	
	//参数值不同，即可重载
	public void test(String a1){}
	
	
	//如果参数相同，但是顺序不同，也可以重载，但是不推荐这种方式，容易引起代码混淆
	public void test(String a1,int a2){}
	public void test(int a2,String a1){}
	
}
