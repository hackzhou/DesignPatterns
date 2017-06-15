package com.design.pattern.absfactory.impl;

import com.design.pattern.absfactory.ISender;

public class MailSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is mail sender!");
	}

}
