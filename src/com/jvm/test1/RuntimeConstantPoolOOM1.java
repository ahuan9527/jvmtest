/*  
* @(#)RuntimeConstantPoolOOM1.java  
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
 * @version 1.0, 2019��7��10�� ����11:08:48 
 */

public class RuntimeConstantPoolOOM1 {
	public static void main(String[] args) {
		String str1 = new StringBuffer("�����").append("���").toString();
		//intern()
		//�ڳ��������Ѿ�������һ�����ڴ�String������ַ������򷵻س����ص��ַ�����String����
		//û�оͽ���String������ַ�����ӵ���������ȥ���ڷ��ش˶���
		System.out.println(str1.intern() == str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern()==str2);
		/**
		 * JDK 1.6�У�intern()��������״��������ַ���ʵ�����Ƶ����ô��У�
		 * ���ص�Ҳ�����ô�������ַ���ʵ�������ã�
		 * ����StringBuilder�������ַ���ʵ����Java���ϣ����Ա�Ȼ����ͬһ�����ã�������false
		 * 
		 * ��JDK 1.7���Լ��������������������JRockit����intern()ʵ�ֲ����ٸ���ʵ����
		 * ֻ���ڳ������м�¼�״γ��ֵ�ʵ�����ã�
		 * ���intern()���ص����ú���StringBuilder�������Ǹ��ַ���ʵ����ͬһ����
		 * 
		 * ��str2�ȽϷ���false����Ϊ"java"����ַ�����ִ��StringBuilder.toString()֮ǰ�Ѿ����ֹ���
		 * �ַ������������Ѿ������������ˣ������ϡ��״γ��֡���ԭ��
		 * ������������������ַ��������״γ��ֵģ���˷���true��
		 * 
		 */
	}
}
