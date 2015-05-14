package com.designpatterns.action.mediator_22;
/**
 * 22、中介者模式（Mediator）
 * @author miaowei
 *
 */
public class User2 extends User {

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		
		System.out.println("user2 exe!");
	}

}
