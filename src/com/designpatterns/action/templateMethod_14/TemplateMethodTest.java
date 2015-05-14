package com.designpatterns.action.templateMethod_14;
/**
 * 模板方法模式测试类
 * @author miaowei
 *
 */
public class TemplateMethodTest {

	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
	    
		System.out.println(result);
	}
}
