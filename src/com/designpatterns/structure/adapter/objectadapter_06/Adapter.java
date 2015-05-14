package com.designpatterns.structure.adapter.objectadapter_06;
/**
 * Adapter类继承Source类，实现Targetable接口
 * @author miaowei
 *
 */
public class Adapter implements Targetable {

	private Source source;
	public Adapter(Source source) {
		super();
		this.source = source;
	}
	@Override
	public void method2() {
		
		System.out.println("this is the targetable method!");  
	}

	@Override
	public void method1() {
		source.method1();
		
	}

}
