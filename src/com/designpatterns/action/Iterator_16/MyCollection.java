package com.designpatterns.action.Iterator_16;

/**
 * 迭代子模式（Iterator）
 * MyCollection中定义了集合的一些操作
 * @author miaowei
 *
 */
public class MyCollection implements Collection {

	//public String string[] = {"A","B","C","D","E"};
	
	public String string[] = null;
	
	public MyCollection(String string[]) {
		
		this.string = string;
		
	}
	@Override
	public Iterator iterator() {
		
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		
		return string[i];
	}

	@Override
	public int size() {
		
		return string.length;
	}

}
