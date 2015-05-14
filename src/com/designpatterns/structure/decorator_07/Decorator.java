package com.designpatterns.structure.decorator_07;
/**
 * Decorator类是一个装饰类
 * @author miaowei
 *
 */
public class Decorator implements Sourceable {

	/**
	 * 装饰对象持有被装饰对象的实例
	 */
	private Sourceable source;
	
	public Decorator(Sourceable sourceable) {
		
		this.source = sourceable;
	}
	@Override
	public void method() {
		
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}

}
