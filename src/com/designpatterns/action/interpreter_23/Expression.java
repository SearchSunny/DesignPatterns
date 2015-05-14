package com.designpatterns.action.interpreter_23;
/**
 * 23、解释器模式（Interpreter）
 * @author miaowei
 *
 */
public interface Expression {

	/**
	 * 解释器操作
	 * @param context 要解释操作的对象
	 * @return
	 */
	public int interpret(Context context);
}
