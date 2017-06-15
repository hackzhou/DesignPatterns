package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.impl.MailSender;
import com.design.pattern.creational.factory.impl.SmsSender;

public class SendFactory {
	
	public ISender produce(String type){
		if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
	}
	
	public ISender produceMail(){
		return new MailSender();
	}
	
	public ISender produceSms(){
		return new SmsSender();
	}

}
