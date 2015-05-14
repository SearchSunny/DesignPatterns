package com.designpatterns.create.factory.method_01;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		
		System.out.println("this is sms sender!");

	}

}
