package com.designpatterns.action.strategy_13;
/**
 * 策略模式测试类
 * @author miaowei
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		
		    String exp = "2*8";  
	        ICalculator cal = new Multiply();  
	        int result = cal.calculate(exp);  
	        System.out.println(result);  
	}
}
