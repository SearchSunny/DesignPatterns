package com.designpatterns.structure.adapter.classadapter_06;
/**
 * Adapter类继承Source类，实现Targetable接口，下面是测试类
 * @author miaowei
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		
		Targetable target = new Adapter();  
        target.method1();  
        target.method2();
	}
}
