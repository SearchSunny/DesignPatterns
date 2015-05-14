package com.designpatterns.action.mediator_22;
/**
 * 22、中介者模式（Mediator）
 * MyMediator为其实现类，里面持有User1和User2的实例，用来实现对User1和User2的控制
 * @author miaowei
 *
 */
public class MyMediator implements Mediator {

	private User user1;
	private User user2;
	
	
	public User getUser1() {
		return user1;
	}
	
	public User getUser2() {
		return user2;
	}
	
	@Override
	public void createMediator() {
		
		user1 = new User1(this);
		user2 = new User2(this);
		
	}

	@Override
	public void workAll() {
		
		user1.work();
		user2.work();
	}

}
