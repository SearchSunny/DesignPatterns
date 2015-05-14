package com.designpatterns.action.visitor_21;

/**
 * 21、访问者模式（Visitor）
 * 一个Visitor类，存放要访问的对象
 * @author miaowei
 *
 */
public interface Visitor {

	/**
	 * 存放要访问的对象
	 * @param subject
	 */
	public void visit(Subject subject) ;
}
