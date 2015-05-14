package com.designpatterns.action.ChainofResponsibility_17;
/**
 * 17责任链模式（Chain of Responsibility）
 * MyHandle类是核心，实例化后生成一系列相互持有的对象，构成一条链。
 * @author miaowei
 *
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;
	
	public MyHandler(String name) {

		this.name = name;
	}
	
	@Override
	public void operator() {
		
		System.out.println(name+"deal!");
		if (getHandler() != null) {
			
			getHandler().operator();
		}
	}

}
