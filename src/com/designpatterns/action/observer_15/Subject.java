package com.designpatterns.action.observer_15;
/**
 * 观察者模式（Observer）
 * 观察者操作行为接口
 * @author miaowei
 *
 */
public interface Subject {

	/**
	 * 增加观察者*/  
    public void add(Observer observer);  
      
    /**
     * 删除观察者*/  
    public void del(Observer observer);  
      
    /**
     * 通知所有的观察者*/  
    public void notifyObservers();  
      
    /**
     * 自身的操作*/  
    public void operation();  
}
