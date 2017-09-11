package com.my.basic.java.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

public class SocketClient {
	
	private Selector selector;
	
	public SocketClient(){
		
	}
	
	public void init() throws Exception{
		SocketChannel server = SocketChannel.open();
		server.configureBlocking(false);
		server.connect(new InetSocketAddress("127.0.0.1",2222));
		selector = Selector.open();
		server.register(selector, SelectionKey.OP_CONNECT);
	}
	
	public void listen() throws Exception{
		while(true){
			selector.select();
			Iterator<SelectionKey> selectedKeys = selector.selectedKeys().iterator();
			while(selectedKeys.hasNext()){
				SelectionKey key = selectedKeys.next();
				if(key.isConnectable()){
					SocketChannel channel = (SocketChannel)key.channel();
					//需要调用channel.finishConnect()才能完成连接
					if (channel.isConnectionPending()) {  
                        channel.finishConnect();  
                    }
					channel.configureBlocking(false);
					channel.write(ByteBuffer.wrap("hello! I'am the new one!".getBytes("UTF-8")));
					channel.register(selector, SelectionKey.OP_READ);
				}
				if(key.isReadable()){
					SocketChannel channel = (SocketChannel)key.channel();
					ByteBuffer bb = ByteBuffer.allocate(1024);
					channel.read(bb);
					bb.flip();
					System.out.println("["+System.currentTimeMillis()+"]server: "+Charset.forName("UTF-8").decode(bb));
				}
				selectedKeys.remove();
			}
		}
	}
	
	public static void main(String[] args) {
		SocketClient sc = new SocketClient();
		try {
			sc.init();
			sc.listen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
