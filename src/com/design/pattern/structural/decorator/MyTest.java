package com.design.pattern.structural.decorator;

public class MyTest {
	
	public static void main(String[] args) {
		
		//1、需要扩展一个类的功能。
		//2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
		Decorator decorator = new Decorator(new Source());
		decorator.method();
		
	}

}
