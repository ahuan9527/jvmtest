/*  
* @(#)TXSS.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test1; 
/**  
 *   
 * <p/>  
 *  
 * Company������������޹�˾  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019��7��9�� ����2:22:36 
 */

public class JavaVMStackSOF {
	private int stackLength = 1;
	public void stackLeak(){
		stackLength ++;
		stackLeak();
	}
	public static void main(String[] args) {
		JavaVMStackSOF omm =new JavaVMStackSOF();
		try {
			omm.stackLeak();
		} catch (Exception e) {
			System.out.println("stack length:"+omm.stackLength);
			throw e;
		}
	}
}
