package com.design.pattern.creational.factory.impl;

import com.design.pattern.creational.factory.ISender;

public class MailSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is mail sender!");
	}

}
