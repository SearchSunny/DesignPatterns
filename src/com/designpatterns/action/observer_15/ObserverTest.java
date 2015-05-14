package com.designpatterns.action.observer_15;
/**
 * 观察者模式（Observer）
 * 测试类
 * @author miaowei
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		
		Subject sub = new MySubject();  
		sub.add(new Observer1());  
		sub.add(new Observer2());  
		
		sub.operation(); 
	}
	
	
}
