package com.design.pattern.structural.proxy;

public class MyTest {
	
	public static void main(String[] args) {
		
		//装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
		//1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
		//2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
		Proxy proxy = new Proxy();
		proxy.method();
		
	}

}
