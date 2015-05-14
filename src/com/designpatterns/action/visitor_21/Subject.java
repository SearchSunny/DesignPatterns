package com.designpatterns.action.visitor_21;
/**
 * 21、访问者模式（Visitor）
 * Subject接口，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性，
 * @author miaowei
 *
 */
public interface Subject {

	/**
	 * 接受将要访问它的对象
	 * @param visitor
	 */
	public void accept(Visitor visitor);
	/**
	 * 获取将要被访问的属性
	 * @return
	 */
	public String getSubject();
}
