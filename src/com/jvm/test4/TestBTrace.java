/*  
* @(#)BTraceTest.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test4; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 *   
 * <p/>  
 *  
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年8月6日 下午2:18:17 
 */

public class TestBTrace {
	public static class BTraceTest{
		public int add(int a,int b){
		return a+b;
	}
	public static void main(String[]args)throws IOException{
		BTraceTest test=new BTraceTest();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<10;i++){
				reader.readLine();
				int a=(int)Math.round(Math.random()*1000);
				int b=(int)Math.round(Math.random()*1000);
				System.out.println(test.add(a,b));
			}
		}
	}
}
