package com.design.pattern.creational.factory.impl;

import com.design.pattern.creational.factory.ISender;

public class SmsSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is sms sender!");
	}

}
