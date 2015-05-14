package com.designpatterns.action.mediator_22;
/**
 * 22、中介者模式（Mediator）
 * 为了解耦，引入了Mediator类，提供统一接口
 * @author miaowei
 *
 */
public interface Mediator {

	/**
	 * 创建中介者
	 */
	public void createMediator();
	/**
	 * 工作行为
	 */
	public void workAll();
}
