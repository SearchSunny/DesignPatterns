package com.designpatterns.structure.adapter.intefaceadapter_06;

public class SourceSub2 extends Wrapper {

	@Override
	public void method2() {
		super.method2();
		System.out.println("the sourceable interface's second Sub2!");
	}
}
