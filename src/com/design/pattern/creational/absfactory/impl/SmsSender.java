package com.design.pattern.creational.absfactory.impl;

import com.design.pattern.creational.absfactory.ISender;

public class SmsSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is sms sender!");
	}

}
