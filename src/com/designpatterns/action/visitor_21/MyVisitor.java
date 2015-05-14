package com.designpatterns.action.visitor_21;
/**
 * 21、访问者模式（Visitor）
 * @author miaowei
 *
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject subject) {
		
		System.out.println("visit the subject:"+subject.getSubject());
		
	}

	
}
