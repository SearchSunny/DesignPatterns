package com.designpatterns.structure.decorator_07;
/**
 * Source类是被装饰类
 * @author miaowei
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		
		 System.out.println("the original method!"); 
	}

}
