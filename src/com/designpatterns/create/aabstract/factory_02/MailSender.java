package com.designpatterns.create.aabstract.factory_02;

public class MailSender implements Sender {

	@Override
	public void Send() {

		System.out.println("this is mailsender!");
	}

}
