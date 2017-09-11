package com.my.basic.java.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class OperateFile {
	
	public void readIt(String filePath){
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(filePath, "rw");
			FileChannel channel = raf.getChannel();
			ByteBuffer bb = ByteBuffer.allocate(1024);
			channel.read(bb);
			bb.flip();
			/*while(bb.hasRemaining()){
				System.out.print((char)bb.get());
			}*/
			//System.out.println(bb.asCharBuffer());
			System.out.print(Charset.forName("GBK").decode(bb));
			channel.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeIt(String filePath){
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(filePath, "rw");
			FileChannel channel = raf.getChannel();
			ByteBuffer bb = ByteBuffer.wrap("added content !".getBytes());
			channel.position(channel.size());
			channel.write(bb);
			channel.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
