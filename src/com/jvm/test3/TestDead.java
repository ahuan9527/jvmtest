/*  
* @(#)TestDead.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test3; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 *   
 * <p/>  
 *  
 * Company������������޹�˾  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019��8��5�� ����5:43:03 
 */

public class TestDead {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusyThread();
		br.readLine();
		Object obj = new Object();
		createLockThread(obj);
	}
	/**
	 * �߳����ȴ���ʾ
	 */
	private static void createLockThread(final Object lock) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					try {
						lock.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		},"testLockThread");
		thread.start();
	}

	private static void createBusyThread() {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) ;
				
			}
		},"testBusyThread");
		thread.start();
	}
	
}
