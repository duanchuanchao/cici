package com.socket.nioSocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIOServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//创建ServerSocketChannel,监听8080端口
		//设置为非阻塞模式
		//为ssc注册选择器
		//创建处理器
		//等待请求，每次等待阻塞3s,超过3s后线程继续向下运行，如果传入0或者不传参数将一直阻塞
		//获取待处理的SelectionKey
	}
	
	private static class Handler{
		
		private int bufferSize =1024;
		private String localCharset = "UTF-8";
		
		public Handler(){}
		
		public Handler(int bufferSize){
			this(bufferSize,null);
		}
		
		public Handler(String LocalCharset){
			this(-1,LocalCharset);
		}
		
		public Handler(int bufferSize,String localCharset){
			if(bufferSize>0)
				this.bufferSize = bufferSize;
			if(localCharset!=null)
				this.localCharset=localCharset;
		}
		
		public void handleAccept(SelectionKey key) throws IOException{
			//获取channel
			SocketChannel sc = ((ServerSocketChannel)key.channel()).accept();
			//获取buffer并重置
			ByteBuffer buffer = (ByteBuffer)key.attachment();
		}
		
	}

}
