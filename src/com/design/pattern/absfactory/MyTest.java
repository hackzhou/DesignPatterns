package com.design.pattern.absfactory;

import com.design.pattern.absfactory.impl.SendSmsFactory;

public class MyTest {
	
	public static void main(String[] args) {
		
		//如果你现在想增加一个功能：则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
		IProvider provider = new SendSmsFactory();
		ISender sender = provider.produce();
		sender.send();
		
	}

}
