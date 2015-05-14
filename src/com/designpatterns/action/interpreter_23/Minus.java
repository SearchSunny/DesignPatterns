package com.designpatterns.action.interpreter_23;
/**
 * 23、解释器模式（Interpreter）
 * 解释减法运算
 * @author miaowei
 *
 */
public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		
		return context.getNum1() - context.getNum2();
	}

}
