package com.designpatterns.action.Iterator_16;
/**
 * 迭代子模式（Iterator）
 * 接口定义迭代操作
 * @author miaowei
 *
 */
public interface Iterator {

	/**
	 * 前移
	 * @return
	 */
	public Object previous();
	/**
	 * 后移
	 * @return
	 */
	public Object next();
	
	public boolean hasNext();
	
	/**
	 * 取得第一个元素
	 * @return
	 */
	public Object first();
}
