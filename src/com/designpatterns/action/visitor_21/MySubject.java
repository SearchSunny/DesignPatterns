package com.designpatterns.action.visitor_21;
/**
 * 21、访问者模式（Visitor）
 * @author miaowei
 *
 */
public class MySubject implements Subject{

	
	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);					
	}

	@Override
	public String getSubject() {
		
		return "love";
	}
}
