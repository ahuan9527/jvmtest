/*  
* @(#)TestJconsole.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test3; 

import java.util.ArrayList;
import java.util.List;

/**  
 *   
 * <p/>  
 *  
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年8月5日 下午4:34:57 
 */

public class TestJconsole {
	/**
	 * 内存占位符对象，一个OOMObject大约占64KB
	 * @param args
	 */
	static class OOMObject{
		public byte[] placeholder = new byte[64*1024];
	}
	public static void main(String[] args) throws InterruptedException {
		fillHeap(1000);
		
	}
	public static void  fillHeap (int num) throws InterruptedException {
		List<OOMObject> lists = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Thread.sleep(50);
			lists.add(new OOMObject());
		}
		System.gc();
	}
}
