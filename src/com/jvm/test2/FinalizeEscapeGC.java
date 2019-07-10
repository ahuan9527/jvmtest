/*  
* @(#)FinalizeEscapeGC.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test2; 
/**  
 *   
 * <p/>  
 *	�˴�����ʾ�����㣺
 *	1.��������ڱ�GCʱ�������ȡ�
 *	2.�����ԾȵĻ���ֻ��һ�Σ���Ϊһ�������finalize()�������ֻ�ᱻϵͳ�Զ�����һ��
 * Company������������޹�˾  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019��7��10�� ����6:19:48 
 */

public class FinalizeEscapeGC {
	public static FinalizeEscapeGC SAVE_HOOK = null;
	private void isAlive() {
		System.out.println("����Ȼ���ţ�");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize is excuted!");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}
	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();
		//�����һ�γɹ������Լ�
		SAVE_HOOK = null;
		System.gc();
		//��Ϊfinalize�������ȼ��ܵͣ�������ͣ0.5���Եȴ���
		Thread.sleep(500);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("�Ծ�ʧ��1��");
		}
		//��һ�εĽ����Ծ�
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(500);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("�Ծ�ʧ��2��");
		}
	}
}
