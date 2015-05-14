package com.designpatterns.action.command_18;
/**
 * 18、命令模式（Command）
 * Invoker是调用者（司令员）
 * @author miaowei
 *
 */
public class Invoker {

	
	private Command command;
	/**
	 * Invoker是调用者（司令员）
	 * @param command
	 */
	public Invoker(Command command) {
	
		this.command = command;
	}
	
	public void action(){
		
		command.exe();
	}
}
