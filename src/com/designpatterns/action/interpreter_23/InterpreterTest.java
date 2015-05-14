package com.designpatterns.action.interpreter_23;
/**
 * 
 * 23、解释器模式（Interpreter）
 * 测试类
 * @author miaowei
 *
 */
public class InterpreterTest {

	public static void main(String[] args) {
		
		//计算9+2-8的值
		
		int result = new Minus().interpret(
				new Context(new Plus().interpret(new Context(9, 2)), 8));
		
		System.err.println(result);
	}
	
//	基本就这样，解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
}
