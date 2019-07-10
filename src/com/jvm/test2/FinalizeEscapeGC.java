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
 *	此代码演示了两点：
 *	1.对象可以在被GC时自我拯救。
 *	2.这种自救的机会只有一次，因为一个对象的finalize()方法最多只会被系统自动调用一次
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年7月10日 下午6:19:48 
 */

public class FinalizeEscapeGC {
	public static FinalizeEscapeGC SAVE_HOOK = null;
	private void isAlive() {
		System.out.println("我依然活着！");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize is excuted!");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}
	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeEscapeGC();
		//对象第一次成功拯救自己
		SAVE_HOOK = null;
		System.gc();
		//因为finalize方法优先级很低，所以暂停0.5秒以等待它
		Thread.sleep(500);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("自救失败1！");
		}
		//再一次的进行自救
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(500);
		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("自救失败2！");
		}
	}
}
