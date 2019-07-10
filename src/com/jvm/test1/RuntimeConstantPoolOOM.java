/*  
* @(#)RuntimeConstantPoolOOM.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test1; 

import java.util.ArrayList;
import java.util.List;

/**  
 *   
 * <p/>  
 *  
 * Company������������޹�˾  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019��7��10�� ����10:50:48 
 */

public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		//ʹ��List�����ų��������ã�����Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<>();
		//10M��PermSize����������С����integer��Χ���㹻����OOM��
		int i = 0;
		while (true) {
			list.add(String.valueOf(i).intern());
		}
	}
}
