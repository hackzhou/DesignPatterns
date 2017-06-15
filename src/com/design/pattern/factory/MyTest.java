package com.design.pattern.factory;

public class MyTest {
	
	public static void main(String[] args) {
		
		SendFactory sendFactory = new SendFactory();
		ISender sender1 = sendFactory.produce("mail"); //如果传入的字符串有误，不能正确创建对象
		sender1.send();
		
		ISender sender2 = sendFactory.produceMail(); //需要实例化工厂类
		sender2.send();
		
		ISender sender3 = SendFactoryStatic.produceMail(); //最常用
		sender3.send();
		
	}

}
