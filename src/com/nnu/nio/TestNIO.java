/**
 * Copyright (c) 2014 ZoroXing and/or its affiliates. All rights reserved.
 */
package com.nnu.nio;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

//import sun.nio.ch.ServerSocketChannelImpl;
/**
 * @author xingjl.fnst
 * @dateTime 2014/09/17 10:27:26
 */
public class TestNIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		ServerSocketChannel ssc = ServerSocketChannel.open();
		//设置SO_REUSEADDR选项
		ssc.socket().setReuseAddress(true);
		//调用ServerSocketChannelImpl#bind方法
		ssc.socket().bind(new InetSocketAddress(1024));
	}

}
