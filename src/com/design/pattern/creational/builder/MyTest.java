package com.design.pattern.creational.builder;

import java.util.List;

import com.design.pattern.creational.absfactory.ISender;

public class MyTest {
	
	public static void main(String[] args) {
		
		Builder builder = new Builder();
        builder.produceMailSender(10);
        
        List<ISender> list = builder.getList();
        for (ISender iSender : list) {
        	iSender.send();
		}
	}

}
