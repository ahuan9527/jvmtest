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
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年7月10日 上午10:50:48 
 */

public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		//使用List保持着常量池引用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<>();
		//10M的PermSize（方法区大小）在integer范围内足够产生OOM了
		int i = 0;
		while (true) {
			list.add(String.valueOf(i).intern());
		}
	}
}
