/*  
* @(#)DirectMemoryOOM.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test1; 

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**  
 *   
 * <p/>  
 *  
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年7月10日 下午4:03:07 
 */

public class DirectMemoryOOM {
	private static final int _1MB= 1024*1024;
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Field field = Unsafe.class.getDeclaredFields()[0];
		field.setAccessible(true);
		Unsafe unsafe =  (Unsafe) field.get(null);
		while (true) {
			unsafe.allocateMemory(_1MB);
		}
	}
}
