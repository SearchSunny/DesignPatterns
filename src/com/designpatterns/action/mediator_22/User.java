package com.designpatterns.action.mediator_22;
/**
 * 22、中介者模式（Mediator）
 * User类统一接口
 * @author miaowei
 *
 */
public abstract class User {

	private Mediator mediator;
	
	public Mediator getMediator() {
		
		return mediator;
	}
	
	public User(Mediator mediator) {
		
		this.mediator = mediator;
	}
	
	public abstract void work();
}
