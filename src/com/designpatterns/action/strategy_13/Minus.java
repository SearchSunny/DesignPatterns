package com.designpatterns.action.strategy_13;
/**
 * 策略模式
 * 实现类
 * @author miaowei
 * 减法运算实现类
 */
public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\-");
		
		return arrayInt[0]-arrayInt[1];
	}

}
