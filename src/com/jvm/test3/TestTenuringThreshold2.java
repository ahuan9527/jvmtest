/*  
* @(#)TestTenuringThreshold2.java  
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
 * @version 1.0, 2019年8月2日 上午10:22:42 
 */
/**
 * ：-verbose:gc-Xms20M-Xmx20M-Xmn10M-XX:+PrintGCDetails-XX:SurvivorRatio=8-XX:MaxTenuringThreshold=15
 *   -XX:+PrintTenuringDistribution
 * @author ahuan
 *
 */
public class TestTenuringThreshold2 {
	private static final int _1MB=1024*1024;
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte[]allocation1,allocation2,allocation3,allocation4;
		allocation1=new byte[_1MB/4];
		//allocation1+allocation2大于survivo空间一半
		allocation2=new byte[_1MB/4];
		allocation3=new byte[4*_1MB];
		allocation4=new byte[4*_1MB];
		allocation4=null;
		allocation4=new byte[4*_1MB];
	}
}
