/*  
* @(#)JavaMethodAreaOOM.java  
*  
* BEIMING SOFTWARE CO.,LTD.  
*  
* Copyright (c) 2011 BMSOFT. All Rights Reserved  
*  
* http://www.bmsoft.com.cn  
*  
*/ 
package com.jvm.test1; 

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**  
 *   
 * <p/>  
 *  
 * Company：北明软件有限公司  
 * @author jianghuan@bmsoft.com.cn  
 * @version 1.0, 2019年7月10日 上午11:34:41 
 */

public class JavaMethodAreaOOM {
	public static void main(String[] args) {
		while (true) {
			 Enhancer enhancer = new Enhancer();
			 enhancer.setSuperclass(OOMObject.class);
			 enhancer.setUseCache(false);
			 enhancer.setCallback(new MethodInterceptor() {
				
				@Override
				public Object intercept(Object obj, Method method, Object[] args,
						MethodProxy proxy) throws Throwable {
					// TODO Auto-generated method stub
					return proxy.invokeSuper(obj, args);
				}
			});
			 enhancer.create();
		}
	}
	static class OOMObject{
		
	}
}
