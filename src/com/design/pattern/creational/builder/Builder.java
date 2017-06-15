package com.design.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;
import com.design.pattern.creational.absfactory.ISender;
import com.design.pattern.creational.absfactory.impl.MailSender;
import com.design.pattern.creational.absfactory.impl.SmsSender;

public class Builder {
	
	private List<ISender> list = new ArrayList<ISender>();

	public void produceMailSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

	public List<ISender> getList() {
		return list;
	}
	public void setList(List<ISender> list) {
		this.list = list;
	}
}
