package com.designpatterns.action.observer_15;
/**
 * 观察者模式（Observer）
 * MySubject类就是我们的主对象
 * 当MySubject变化时，Observer1和Observer2必然变化
 * @author miaowei
 *
 */
public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
	
		 System.out.println("update self!");  
	     notifyObservers();
	}

}
