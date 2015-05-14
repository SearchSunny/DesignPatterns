package com.designpatterns.structure.adapter.classadapter_06;
/**
 * Adapter类继承Source类，实现Targetable接口
 * @author miaowei
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		
		System.out.println("this is the targetable method!");  
	}

}
