package com.designpatterns.action.templateMethod_14;
/**
 * 模板方法模式
 * 加法实现类
 * @author miaowei
 *
 */
public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		
		return num1 + num2;
	}

}
