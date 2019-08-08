/*  
* @(#)TestAllocation.java  
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
 * Company������������޹�˾  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019��8��1�� ����5:16:42 
 */

public class TestAllocation {
	private static final int _1MB = 1024*1024;
	public static void main(String[] args) {
//			testAllocation();
		testPretenureSizeThreshold();
	}
	/**
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails  -XX:SurvivorRatio=8
	 */
	/*public static void testAllocation(){
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1=new byte[2*_1MB];
		allocation2=new byte[2*_1MB];
		allocation3=new byte[2*_1MB];
		allocation4=new byte[4*_1MB];//����һ��Minor GC
	}*/
	/**
	 * -verbose:gc-Xms20M-Xmx20M-Xmn10M-XX:+PrintGCDetails-XX:SurvivorRatio=8
	 * -XX:PretenureSizeThreshold=3145728 ����3M ����������� 
	 */
	public static void testPretenureSizeThreshold(){
			byte[] allocation;
			allocation=new byte[4*_1MB];//ֱ�ӷ������������
		}
}
