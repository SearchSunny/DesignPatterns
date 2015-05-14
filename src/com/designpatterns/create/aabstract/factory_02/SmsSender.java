package com.designpatterns.create.aabstract.factory_02;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		
		System.out.println("this is sms sender!");

	}

}
