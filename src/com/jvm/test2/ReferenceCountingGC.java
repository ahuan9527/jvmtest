/*  
* @(#)ReferenceCountingGC.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test2; 


/**  
 *   
 * <p/>  
 *  
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年7月10日 下午4:57:26 
 */

public class ReferenceCountingGC {
	public Object instance = null;
	private static final int _1MB = 1024*1024;
	private byte[] bigSize = new byte[2*_1MB];
	public static void testGC(){
		ReferenceCountingGC A = new ReferenceCountingGC();
		ReferenceCountingGC B = new ReferenceCountingGC();
		A.instance = B;
		B.instance = A;
		A = null;
		B = null;
		//假设这儿执行GC，对象能否被回收
		System.gc();
	}
	public static void main(String[] args) {
		testGC();
	}
}
