package com.designpatterns.action.ChainofResponsibility_17;
/**
 * 17责任链模式（Chain of Responsibility）
 * AbstractHandler
 * Abstracthandler类提供了get和set方法，方便MyHandle类设置和修改引用对象 
 * @author miaowei
 *
 */
public abstract class AbstractHandler {

	private Handler handler;

	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	
}
