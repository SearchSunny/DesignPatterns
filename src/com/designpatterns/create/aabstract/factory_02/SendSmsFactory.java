package com.designpatterns.create.aabstract.factory_02;
/**
 * 这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码
 * @author miaowei
 *
 */
public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		
		return new SmsSender();
	}

}
