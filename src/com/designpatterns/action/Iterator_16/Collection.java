package com.designpatterns.action.Iterator_16;



/**
 * 迭代子模式（Iterator）
 * 接口定义了集合的一些操作
 * @author miaowei
 *
 */
public interface Collection {

	/**
	 * 
	 * @return
	 */
	public Iterator iterator();
	/**
	 * 取得集合元素
	 * @param i
	 * @return
	 */
	public Object get(int i);
	/**
	 * 取得集合大小
	 * @return
	 */
	public int size();
}
