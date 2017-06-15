package com.design.pattern.factory;

import com.design.pattern.factory.impl.MailSender;
import com.design.pattern.factory.impl.SmsSender;

public class SendFactoryStatic {
	
	public static ISender produceMail(){
		return new MailSender();
	}
	
	public static ISender produceSms(){
		return new SmsSender();
	}

}
