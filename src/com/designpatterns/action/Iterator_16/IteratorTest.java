package com.designpatterns.action.Iterator_16;
/**
 * 迭代子模式（Iterator）测试类
 * @author miaowei
 *
 */
public class IteratorTest {
	
	public static String string[] = {"A","B","C","D","E","F"};
	
	public static void main(String[] args) {
		
		Collection collection = new MyCollection(string);
		
		Iterator iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		//此处我们貌似模拟了一个集合类的过程，感觉是不是很爽？其实JDK中各个类也都是这些基本的东西，
		//加一些设计模式，再加一些优化放到一起的，只要我们把这些东西学会了，掌握好了，我们也可以写出自己的集合类，甚至框架
	}
}
