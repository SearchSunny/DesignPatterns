package com.designpatterns.create.factory.method_01;
/**
 * 创建工厂类
 * @author miaowei
 *
 */
public class SendFactory {

	/**
	 * 普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象
	 * @param type
	 * @return
	 */
	public Sender produce(String type) {
		
		if ("mail".equals(type)) {
			
			return new MailSender();
		}else if ("sms".equals(type)) {
			
			return new SmsSender();
		}else {
			
			System.out.println("请输入正确的类型！");
			return null;
		}
		
	}
	/**
	 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
	 * @return
	 */
	public Sender produceMail() {
		
		return new MailSender();
	}
	
	public Sender produceSms() {
		
		return new SmsSender();
	}
	
	/**
	 * 静态工厂方法模式
	 * @return
	 */
	public static Sender produceMailStatic() {
		
		return new MailSender();
	}
	
	public static Sender produceSmsStatic() {
		
		return new SmsSender();
	}
}
