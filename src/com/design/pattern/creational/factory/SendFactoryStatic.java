package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.impl.MailSender;
import com.design.pattern.creational.factory.impl.SmsSender;

public class SendFactoryStatic {
	
	public static ISender produceMail(){
		return new MailSender();
	}
	
	public static ISender produceSms(){
		return new SmsSender();
	}

}
