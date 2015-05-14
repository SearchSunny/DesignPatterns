package com.designpatterns.structure.adapter.objectadapter_06;
/**
 * Adapter类继承Source类，实现Targetable接口，下面是测试类
 * @author miaowei
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Adapter(source);  
        target.method1();  
        target.method2();
	}
}
