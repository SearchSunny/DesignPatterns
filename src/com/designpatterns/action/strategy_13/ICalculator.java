package com.designpatterns.action.strategy_13;
/**
 * 策略模式
 * 提供统一方法接口
 * @author miaowei
 *
 */
public interface ICalculator {

	/**
	 * 统一计算方法
	 * @param exp
	 * @return
	 */
	public int calculate(String exp);
}
