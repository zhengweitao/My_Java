package com.my.basic.java.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class SocketServer {
	
	private Selector selector;
	private int num = 0 ;
	
	public void init() throws Exception{
		ServerSocketChannel server = ServerSocketChannel.open();
		server.configureBlocking(false);
		server.bind(new InetSocketAddress(2222));
		selector = Selector.open();
		server.register(selector, SelectionKey.OP_ACCEPT);
	}
	
	public void listen() throws Exception{
		while(true){
			selector.select();
			Iterator<SelectionKey> selectedKeys = selector.selectedKeys().iterator();
			while(selectedKeys.hasNext()){
				SelectionKey key = selectedKeys.next();
				if(key.isAcceptable()){
					ServerSocketChannel server = (ServerSocketChannel)key.channel();
					SocketChannel channel = server.accept();
					channel.configureBlocking(false);
					channel.write(ByteBuffer.wrap("welcome !".getBytes("UTF-8")));
					channel.register(selector, SelectionKey.OP_READ);
				}
				if(key.isReadable()){
					SocketChannel channel = (SocketChannel)key.channel();
					ByteBuffer bb = ByteBuffer.allocate(1024);
					channel.read(bb);
					bb.flip();
					System.out.println("["+System.currentTimeMillis()+"]client: "+ new String(bb.array()));
					//channel.register(selector, SelectionKey.OP_WRITE);
				}
			/*	if(key.isWritable()){
					SocketChannel channel = (SocketChannel)key.channel();
					ByteBuffer bb = ByteBuffer.allocate(1024);
					channel.write(ByteBuffer.wrap(("count_"+(num++)).getBytes("UTF-8")));
					channel.register(selector, SelectionKey.OP_READ);
				}*/
				selectedKeys.remove();
				
			}
		}
	}
	
	public static void main(String[] args) {
		SocketServer ss = new SocketServer();
		try {
			ss.init();
			ss.listen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
