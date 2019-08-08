/*  
* @(#)TestTenuringThreshold.java  
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
 * @version 1.0, 2019年8月2日 上午9:57:53 
 */

public class TestTenuringThreshold {
	private static final int _1MB=1024*1024;
	public static void main(String[] args) {
		System.out.println("开始！");
		testTenuringThreshold();
	}
	
	/**
	 * ：-verbose:gc-Xms20M-Xmx20M-Xmn10M-XX:+PrintGCDetails-XX:SurvivorRatio=8-XX:MaxTenuringThreshold=1
	 *-XX:+PrintTenuringDistribution
	 */
	@SuppressWarnings("unused")
	public static void testTenuringThreshold(){
		byte[]allocation1,allocation2,allocation3;
			allocation1=new byte[_1MB/4];
			//什么时候进入老年代取决于XX:MaxTenuringThreshold设置
			allocation2=new byte[4*_1MB];
			allocation3=new byte[4*_1MB];
			allocation3=null;
			allocation3=new byte[4*_1MB];
		}
}
