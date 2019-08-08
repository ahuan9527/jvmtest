/*  
* @(#)TestBar.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test3; 
/**  
 *   
 * <p/>  
 *  
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年8月5日 下午4:02:07 
 */

public class TestBar {
	int a=1;
	static  int b=2;
	
	public int sum(int c){
		return a+b+c;
	}
	public static void main(String[] args) {
		new TestBar().sum(3);
	}
}
