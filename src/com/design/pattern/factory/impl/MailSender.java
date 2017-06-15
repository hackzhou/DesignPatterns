package com.design.pattern.factory.impl;

import com.design.pattern.factory.ISender;

public class MailSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is mail sender!");
	}

}
