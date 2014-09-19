/**
 * Copyright (c) 2014 ZoroXing and/or its affiliates. All rights reserved.
 */
package com.nnu.thread;

/**
 * @author xingjl.fnst
 * @dateTime 2014/09/17 16:23:53
 * @summary  线程组(父子关系)： NULL->System->Main
 */
public class TestThread extends Thread implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

//		new TestThread(new TestThread()).start();
		
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true);
			}
		});
		thread.start();
		Thread curThread = Thread.currentThread();
		
		System.out.println("Threed Name:" + thread.getName());
		System.out.println("Current Threed Name:" + curThread.getName());
		System.out.println();
		System.out.println("Threed group Name:" + thread.getThreadGroup().getName());
		System.out.println("Parent Threed group Name:" + thread.getThreadGroup().getParent().getName());
		System.out.println();
		System.out.println("Current Threed group Name:" + curThread.getThreadGroup().getName());
		System.out.println("Current Parent Threed group Name:" + curThread.getThreadGroup().getParent().getName());
		
		ThreadGroup tg = thread.getThreadGroup();
		int nthread = tg.activeCount();
		Thread []threads = new Thread[nthread];
		System.out.println("===");
		tg.enumerate(threads);
		for ( int i=0 ;i<threads.length;i++){
			System.out.println("Threed Name:" + threads[i].getName());
		} 
	}

	
	public TestThread(Runnable runable){
		super(runable);
	}
	
	public TestThread(){}
	
	public void run(){
		System.out.println("dfdfd");
	}
}
