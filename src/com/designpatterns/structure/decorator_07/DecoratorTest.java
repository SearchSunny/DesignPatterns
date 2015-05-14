package com.designpatterns.structure.decorator_07;
/**
 * 测试类
 * @author miaowei
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);  
		obj.method();
	}
}
