package com.design.pattern.absfactory.impl;

import com.design.pattern.absfactory.IProvider;
import com.design.pattern.absfactory.ISender;

public class SendMailFactory implements IProvider {

	@Override
	public ISender produce() {
		return new MailSender();
	}

}
