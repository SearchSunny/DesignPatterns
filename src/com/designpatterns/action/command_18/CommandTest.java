package com.designpatterns.action.command_18;
/**
 * 18、命令模式（Command）测试类
 * @author miaowei
 *
 */
public class CommandTest {

	public static void main(String[] args) {
		
		Receiver receiver = new Receiver();
		
		Command cmdCommand = new MyCommand(receiver);
		
		Invoker invoker = new Invoker(cmdCommand);
		
		invoker.action();
	}
}
