package com.designpatterns.create.factory.method_01;

public class MailSender implements Sender {

	@Override
	public void Send() {

		System.out.println("this is mailsender!");
	}

}
