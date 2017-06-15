package com.design.pattern.creational.absfactory.impl;

import com.design.pattern.creational.absfactory.IProvider;
import com.design.pattern.creational.absfactory.ISender;

public class SendMailFactory implements IProvider {

	@Override
	public ISender produce() {
		return new MailSender();
	}

}
