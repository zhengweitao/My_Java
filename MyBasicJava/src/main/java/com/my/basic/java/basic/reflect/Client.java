package com.my.basic.java.basic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) {
		String className = "com.my.basic.java.MyBasicJava.reflect.DemoClass";
		String interfaceName = "com.my.basic.java.MyBasicJava.reflect.DemoInterface";
		
		Class clazz;
		try {
			clazz = Class.forName(className);
			Object o = clazz.newInstance();
			System.out.println(clazz.isInterface());
			Method[] methods = clazz.getMethods();
			Field[] fields = clazz.getFields();
			for (int i = 0; i < methods.length; i++) {
				System.out.println("方法："+methods[i].getName());
			}
			for (int i = 0; i < fields.length; i++) {
				System.out.println("属性："+fields[i].getName());
				System.out.println(fields[i].getType());
				System.out.println(fields[i].get(o));
			}
			Class[] cl = new Class[]{String.class,int.class};
			Method m = clazz.getMethod("test3", cl);
			Object[] params = new Object[]{"test3333",100};
			m.invoke(o, params);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
