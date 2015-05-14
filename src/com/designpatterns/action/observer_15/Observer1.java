package com.designpatterns.action.observer_15;

/**
 * 观察者模式（Observer）
 * 观察者实现类1
 * @author miaowei
 *
 */
public class Observer1 implements Observer{

	@Override
	public void update() {
		
		System.out.println("observer1 has received!");
		
	}

}
