package com.my.basic.java.nio;

public class App {

	public static void main(String[] args) {
		OperateFile oper = new OperateFile();
		System.out.println(System.getProperty("file.encoding"));
		oper.readIt("C:/Users/victor/Desktop/阴阳师.txt");
//		oper.writeIt("C:/Users/victor/Desktop/NIO.txt");
	}

}
