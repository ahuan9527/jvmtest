/*  
* @(#)Test1.java  
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
 * @version 1.0, 2019��7��4�� ����6:26:43 
 */

public class Test1 {
	static class OOMObject{
		
	}
	public static void main(String[] args) {
		List<OOMObject> list=new ArrayList<OOMObject>();
		while(true){
		list.add(new OOMObject());
		}
	}
}
