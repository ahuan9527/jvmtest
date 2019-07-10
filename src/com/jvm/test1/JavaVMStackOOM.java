/*  
* @(#)JavaVMStackOOM.java  
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
 * @version 1.0, 2019��7��9�� ����3:02:20 
 */

public class JavaVMStackOOM {
	static int i = 0;
	private void dontStop(int i){
		System.out.println("��"+i+"���߳�");
		while (true) {
			
		}
	}
	public void stackLeakByThread(){
		
		while (true) {
			i++;
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public synchronized void run() {
					// TODO Auto-generated method stub
					dontStop(JavaVMStackOOM.i);
				}
			});
			thread.start();
		}
		
	}
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}
}
