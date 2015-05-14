package com.designpatterns.action.command_18;
/**
 * 18、命令模式（Command）
 * MyCommand是命令，实现了Command接口，持有接收对象
 * @author miaowei
 *
 */
public class MyCommand implements Command {

	private Receiver receiver;
	/**
	 * MyCommand是命令，实现了Command接口，持有接收对象
	 * @param receiver
	 */
	public MyCommand(Receiver receiver) {
		
		this.receiver = receiver;
	}
	@Override
	public void exe() {
		
		receiver.action();
	}

}
