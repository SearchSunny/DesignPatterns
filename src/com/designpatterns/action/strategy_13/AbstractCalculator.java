package com.designpatterns.action.strategy_13;
/**
 * 策略模式
 * AbstractCalculator是辅助类，提供辅助方法
 * @author miaowei
 *
 */
public abstract class AbstractCalculator {

	/**
	 * 辅助计算函数
	 * @param exp
	 * @param opt
	 * @return
	 */
	public int[] split(String exp,String opt){
		
		String array[] = exp.split(opt);
		
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		
		return arrayInt;
		
	}
}
