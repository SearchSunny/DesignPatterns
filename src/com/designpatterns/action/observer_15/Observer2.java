package com.designpatterns.action.observer_15;

/**
 * 观察者模式（Observer）
 * 观察都实现类2
 * @author miaowei
 *
 */
public class Observer2 implements Observer{

	@Override
	public void update() {
		
		System.out.println("observer2 has received!");
		
	}

}
